package com.cyneck.zero.entry.dao.common;

import com.cyneck.zero.common.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Eric Lee
 * @version v1.0.0
 * @Package : com.cyneck.zero.entry.dao.common
 * @Description : TODO
 * @Create on : 2019/5/9 09:02
 **/
public class Update {

    private boolean ok = false;

    public Update(Object object) {
        MyUpdate myUpdate = new MyUpdate(object);

        Connection connection = DBUtil.getConnection();

        String sql = myUpdate.getSql();

        int length = myUpdate.getLength();

        Object[] resultArray = myUpdate.getResultArray();

        try {

            PreparedStatement prepareStatement = connection.prepareStatement(sql);

            prepareStatement.setObject(length, resultArray[0]);

            for (int i = 1; i < length; i++) {
                prepareStatement.setObject(i, resultArray[i]);
            }

            int executeUpdate = prepareStatement.executeUpdate();

            if (executeUpdate > 0) {
                ok = true;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public boolean isOk() {
        return ok;
    }
}
