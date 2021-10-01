package nl.mds.springcloud.exception;

public class CourseNameEmptyException extends Exception {

    public CourseNameEmptyException(String error) {
        super(error);
    }
}
