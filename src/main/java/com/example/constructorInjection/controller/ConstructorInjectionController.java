package com.example.constructorInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.example.constructorInjection.service.ConstructorInjectionService;
import com.example.constructorInjection.service.Region;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.example.constructorInjection.service.HAConfigProperties;

import lombok.RequiredArgsConstructor;
@Tag(name="this is my API",description="API to get some good data on person")
@RestController
@RequiredArgsConstructor
//@PropertySource("classpath:application.properties")
public class ConstructorInjectionController {
	/*
	 * @Autowired HAConfigProperties ha; final ConstructorInj constructorInj; final
	 * ConstructorInjectionService constructorInjectionService;
	 * 
	 * @Value("${too}") String s;
	 * 
	 * @GetMapping("/private/dsds") public Region someone() {
	 * 
	 * return constructorInj.popoi();
	 * 
	 * }
	 * 
	 * @GetMapping(value="/private/diffofcompandconfig") public String
	 * diffofcompandconfig() {
	 * 
	 * System.out.println("diff of compand config"); return
	 * constructorInjectionService.display();
	 * 
	 * }
	 * 
	 * @GetMapping(value="/public/dsds",produces={"application/json"}) public Region
	 * some() {
	 * 
	 * System.out.println(s); // constructorInjectionService.pop(); return
	 * constructorInj.popoi();
	 * 
	 * }
	 */
	@Value("${swagger.getpersonData.description}")
	String s;
	
	@APIGETGOODPERSONDATA

	@GetMapping("/public/sendsomeGoodData")
	public Person pop(@Parameter(description="${swagger.getpersonData.description}", required=true)
	@RequestParam String name,
	@Parameter(description="please pass the age", required=true)
	@RequestParam int age)
	{
		return new Person(name+s,age);
	}
	/*
	 * @GetMapping("/public/sendHA") public String getttingha() { return
	 * ha.getHostName(); }
	 */

}

/*
 * Map config = new HashMap<>();
 * config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
 * config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
 * StringSerializer.class);
 * config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
 * StringSerializer.class); KafkaProducer<String, String> producer = new
 * KafkaProducer<>(config); ProducerRecord<String, String> record = new
 * ProducerRecord<String, String>("nus25112021zabi", "Hye Kafka");
 * producer.send(record, new Callback() { public void
 * onCompletion(RecordMetadata recordMetadata, Exception e) { Logger logger =
 * LoggerFactory.getLogger(ConstructorInjectionController.class); if (e == null)
 * { logger.info("Successfully received the details as: \n" + "Topic:" +
 * recordMetadata.topic() + "\n" + "Partition:" + recordMetadata.partition() +
 * "\n" + "Offset" + recordMetadata.offset() + "\n" + "Timestamp" +
 * recordMetadata.timestamp()); }
 * 
 * else { logger.error("Can't produce,getting error", e);
 * 
 * } } });
 */
// producer.flush();
// producer.close();

// public ConstructorInjectionController() { }

/*
 * public ConstructorInjectionController(ConstructorInj constructor) {
 * this.constructorIn = constructor; }
 */
