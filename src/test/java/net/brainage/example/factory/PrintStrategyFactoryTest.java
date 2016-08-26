package net.brainage.example.factory;

import net.brainage.example.factory.model.Document;
import net.brainage.example.factory.strategy.PrintStrategyFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ms29.seo on 2016-08-09.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:context-factory.xml"})
public class PrintStrategyFactoryTest {

    @Autowired
    PrintStrategyFactory printStrategyFactory;

    @Test
    public void printStrategyFactoryTest() {
        Document document = new Document();

        printStrategyFactory.getPrintStrategy("DEFAULT").pring(document);

        printStrategyFactory.getPrintStrategy("A5L").pring(document);
        printStrategyFactory.getPrintStrategy("A5P").pring(document);
        printStrategyFactory.getPrintStrategy("A4Landscape").pring(document);
    }

}
