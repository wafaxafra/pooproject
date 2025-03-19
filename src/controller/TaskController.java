package controller;

import model.Task;
import model.TaskDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TaskController {
    private TaskDAO taskDAO;

    public TaskController() {
        this.taskDAO = new TaskDAO();
    }

    public void addTask(Task task) throws SQLException, IOException {
        taskDAO.addTask(task);
    }

    public void deleteTask(int taskId) throws SQLException, IOException {
        taskDAO.deleteTask(taskId);
    }

    public List<Task> getTasksByUser(int userId) throws SQLException, IOException {
        return taskDAO.getTasksByUserId(userId);
    }
}
