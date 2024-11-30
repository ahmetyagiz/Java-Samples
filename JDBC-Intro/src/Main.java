import java.sql.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws SQLException
    {

    }

    private static void deleteDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;
        ResultSet resultSet;

        try
        {
            connection = helper.getConnection();
            String sql = "delete from city where id = 4080";
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("Kayıt silindi");
        }
        catch (SQLException exception)
        {
            helper.showErrorMessage(exception);
        }
        finally
        {
            statement.close();
            connection.close();
        }
    }

    private static void updateDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;
        ResultSet resultSet;

        try
        {
            connection = helper.getConnection();
            String sql = "update city set Population = 80000, district = 'Düzce' where id = 4080";
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");
        }
        catch (SQLException exception)
        {
            helper.showErrorMessage(exception);
        }
        finally
        {
            statement.close();
            connection.close();
        }
    }

    private static void insertDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        PreparedStatement statement = null;
        ResultSet resultSet;

        try
        {
            connection = helper.getConnection();
            String sql = "insert into city (Name, CountryCode, District, Population)values (?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Düzce");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 70000);
            statement.executeUpdate();
            System.out.println("Kayıt eklendi");
        }
        catch (SQLException exception)
        {
            helper.showErrorMessage(exception);
        }
        finally
        {
            statement.close();
            connection.close();
        }
    }

    private static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();

        Statement statement = null;
        ResultSet resultSet;

        try
        {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country ");
            ArrayList<Country> countries = new ArrayList<Country>();

            while (resultSet.next())
            {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region"))
                );
            }
            System.out.println(countries.size());
        }
        catch (SQLException exception)
        {
            helper.showErrorMessage(exception);
        }
        finally
        {
            statement.close();
            connection.close();
        }
    }
}