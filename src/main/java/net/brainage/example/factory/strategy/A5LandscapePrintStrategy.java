package net.brainage.example.factory.strategy;

import lombok.extern.slf4j.Slf4j;
import net.brainage.example.factory.model.Document;
import org.springframework.stereotype.Component;

@Slf4j
@Component("A5Landscape")
public class A5LandscapePrintStrategy implements PrintStrategy {
    @Override
    public void pring(Document document) {
        log.info("Doing stuff to print an A5 landscape document");
    }
}
