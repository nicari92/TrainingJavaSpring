import java.time.*; 
 
public interface Time {
    void setTime(int h, int min, int s);
    void setDate(int d, int mo, int y);
    LocalDateTime getLocalDateTime();
}
