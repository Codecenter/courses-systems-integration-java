package jobs.simple;
import org.springframework.batch.item.ItemProcessor;

public class TranslateToUpperCaseProcessor implements ItemProcessor<String, String> {
    @Override
    public String process(String item) throws Exception {
        return item.toUpperCase();
    }
}
