package io.swagger.api;

import io.swagger.model.ProductOffering;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Generated(
        value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-16T12:39:15.018Z[GMT]")
@RestController
public class ProductOfferingApiController implements ProductOfferingApi {

    private static final Logger log = LoggerFactory
            .getLogger(ProductOfferingApiController.class);

    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;

    @Autowired
    public ProductOfferingApiController(ObjectMapper objectMapper,
                                        HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    //Manque juste un Mapping ?
    public ResponseEntity<List<ProductOffering>> listProductOffering(
            @Parameter @Valid @RequestParam(
                    value = "fields", required = false) String fields,
            @Parameter @Valid @RequestParam(
                    value = "offset", required = false) Integer offset,
            @Parameter @Valid @RequestParam(
                    value = "limit", required = false) Integer limit)
    {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProductOffering>>(
                        objectMapper.readValue("[ {" +
                                "\n  \"isBundle\" : true," +
                                "\n  \"lifecycleStatus\" : \"lifecycleStatus\"," +
                                "\n  \"serviceCandidate\" : {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"," +
                                "\n    \"version\" : \"version\"" +
                                "\n  }," +
                                "\n  \"@type\" : \"@type\"," +
                                "\n  \"channel\" : [ {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  }, {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  } ]," +
                                "\n  \"description\" : \"description\"," +
                                "\n  \"productOfferingPrice\" : [ {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  }, {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  } ],\n  \"resourceCandidate\" : {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"," +
                                "\n    \"version\" : \"version\"" +
                                "\n  }," +
                                "\n  \"statusReason\" : \"statusReason\"," +
                                "\n  \"bundledProductOffering\" : [ {" +
                                "\n    \"bundledProductOfferingOption\" : {" +
                                "\n      \"@baseType\" : \"@baseType\"," +
                                "\n      \"numberRelOfferDefault\" : 6," +
                                "\n      \"numberRelOfferLowerLimit\" : 1," +
                                "\n      \"@type\" : \"@type\"," +
                                "\n      \"numberRelOfferUpperLimit\" : 5," +
                                "\n      \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n    }," +
                                "\n    \"lifecycleStatus\" : \"lifecycleStatus\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  }, {" +
                                "\n    \"bundledProductOfferingOption\" : {" +
                                "\n      \"@baseType\" : \"@baseType\"," +
                                "\n      \"numberRelOfferDefault\" : 6," +
                                "\n      \"numberRelOfferLowerLimit\" : 1," +
                                "\n      \"@type\" : \"@type\"," +
                                "\n      \"numberRelOfferUpperLimit\" : 5," +
                                "\n      \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n    }," +
                                "\n    \"lifecycleStatus\" : \"lifecycleStatus\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  } ]," +
                                "\n  \"attachment\" : [ {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"attachmentType\" : \"attachmentType\"," +
                                "\n    \"validFor\" : {" +
                                "\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\"," +
                                "\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"" +
                                "\n    }," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"description\" : \"description\"," +
                                "\n    \"mimeType\" : \"mimeType\"," +
                                "\n    \"content\" : \"content\"," +
                                "\n    \"url\" : \"url\"," +
                                "\n    \"size\" : {" +
                                "\n      \"amount\" : 0.8008282," +
                                "\n      \"units\" : \"units\"" +
                                "\n    }," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  }, {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"attachmentType\" : \"attachmentType\"," +
                                "\n    \"validFor\" : {" +
                                "\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\"," +
                                "\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"" +
                                "\n    }," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"description\" : \"description\"," +
                                "\n    \"mimeType\" : \"mimeType\"," +
                                "\n    \"content\" : \"content\"," +
                                "\n    \"url\" : \"url\"," +
                                "\n    \"size\" : {" +
                                "\n      \"amount\" : 0.8008282," +
                                "\n      \"units\" : \"units\"" +
                                "\n    }," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  } ]," +
                                "\n  \"@baseType\" : \"@baseType\"," +
                                "\n  \"id\" : \"id\"," +
                                "\n  \"href\" : \"href\"," +
                                "\n  \"place\" : [ {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  }, {" +
                                "\n    \"@referredType\" : \"@referredType\"," +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                "\n    \"name\" : \"name\"," +
                                "\n    \"id\" : \"id\"," +
                                "\n    \"href\" : \"href\"," +
                                "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                "\n  } ]," +
                                "\n  \"@schemaLocation\" : \"http://example.com/aeiou\"," +
                                "\n  \"productOfferingTerm\" : [ {" +
                                "\n    \"@baseType\" : \"@baseType\"," +
                                "\n    \"@type\" : \"@type\"," +
                                        "\n    \"name\" : \"name\"," +
                                        "\n    \"description\" : \"description\"," +
                                        "\n    \"@schemaLocation\" : \"http://example.com/aeiou\"" +
                                        "\n  }, {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"marketSegment\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"prodSpecCharValueUse\" : [ {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  }, {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  } ],\n  \"agreement\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"isSellable\" : true,\n  \"serviceLevelAgreement\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"version\" : \"version\",\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"name\" : \"name\",\n  \"category\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  } ]\n}, {\n  \"isBundle\" : true,\n  \"lifecycleStatus\" : \"lifecycleStatus\",\n  \"serviceCandidate\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  },\n  \"@type\" : \"@type\",\n  \"channel\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"description\" : \"description\",\n  \"productOfferingPrice\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"resourceCandidate\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  },\n  \"statusReason\" : \"statusReason\",\n  \"bundledProductOffering\" : [ {\n    \"bundledProductOfferingOption\" : {\n      \"@baseType\" : \"@baseType\",\n      \"numberRelOfferDefault\" : 6,\n      \"numberRelOfferLowerLimit\" : 1,\n      \"@type\" : \"@type\",\n      \"numberRelOfferUpperLimit\" : 5,\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\n    },\n    \"lifecycleStatus\" : \"lifecycleStatus\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"bundledProductOfferingOption\" : {\n      \"@baseType\" : \"@baseType\",\n      \"numberRelOfferDefault\" : 6,\n      \"numberRelOfferLowerLimit\" : 1,\n      \"@type\" : \"@type\",\n      \"numberRelOfferUpperLimit\" : 5,\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\n    },\n    \"lifecycleStatus\" : \"lifecycleStatus\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"attachment\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"attachmentType\" : \"attachmentType\",\n    \"validFor\" : {\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"description\" : \"description\",\n    \"mimeType\" : \"mimeType\",\n    \"content\" : \"content\",\n    \"url\" : \"url\",\n    \"size\" : {\n      \"amount\" : 0.8008282,\n      \"units\" : \"units\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"attachmentType\" : \"attachmentType\",\n    \"validFor\" : {\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"description\" : \"description\",\n    \"mimeType\" : \"mimeType\",\n    \"content\" : \"content\",\n    \"url\" : \"url\",\n    \"size\" : {\n      \"amount\" : 0.8008282,\n      \"units\" : \"units\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"@baseType\" : \"@baseType\",\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"place\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"productOfferingTerm\" : [ {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"marketSegment\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"prodSpecCharValueUse\" : [ {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  }, {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  } ],\n  \"agreement\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"isSellable\" : true,\n  \"serviceLevelAgreement\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"version\" : \"version\",\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"name\" : \"name\",\n  \"category\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"," +
                                "\n    \"version\" : \"version\"\n  } ]\n} ]",
                                List.class),
                        HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProductOffering>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProductOffering>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductOffering> retrieveProductOffering(@Parameter(in = ParameterIn.PATH, description = "Identifier of the ProductOffering", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductOffering>(objectMapper.readValue("{\n  \"isBundle\" : true,\n  \"lifecycleStatus\" : \"lifecycleStatus\",\n  \"serviceCandidate\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  },\n  \"@type\" : \"@type\",\n  \"channel\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"description\" : \"description\",\n  \"productOfferingPrice\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"resourceCandidate\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  },\n  \"statusReason\" : \"statusReason\",\n  \"bundledProductOffering\" : [ {\n    \"bundledProductOfferingOption\" : {\n      \"@baseType\" : \"@baseType\",\n      \"numberRelOfferDefault\" : 6,\n      \"numberRelOfferLowerLimit\" : 1,\n      \"@type\" : \"@type\",\n      \"numberRelOfferUpperLimit\" : 5,\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\n    },\n    \"lifecycleStatus\" : \"lifecycleStatus\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"bundledProductOfferingOption\" : {\n      \"@baseType\" : \"@baseType\",\n      \"numberRelOfferDefault\" : 6,\n      \"numberRelOfferLowerLimit\" : 1,\n      \"@type\" : \"@type\",\n      \"numberRelOfferUpperLimit\" : 5,\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\n    },\n    \"lifecycleStatus\" : \"lifecycleStatus\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"attachment\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"attachmentType\" : \"attachmentType\",\n    \"validFor\" : {\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"description\" : \"description\",\n    \"mimeType\" : \"mimeType\",\n    \"content\" : \"content\",\n    \"url\" : \"url\",\n    \"size\" : {\n      \"amount\" : 0.8008282,\n      \"units\" : \"units\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"attachmentType\" : \"attachmentType\",\n    \"validFor\" : {\n      \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"description\" : \"description\",\n    \"mimeType\" : \"mimeType\",\n    \"content\" : \"content\",\n    \"url\" : \"url\",\n    \"size\" : {\n      \"amount\" : 0.8008282,\n      \"units\" : \"units\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"@baseType\" : \"@baseType\",\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"place\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"productOfferingTerm\" : [ {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"marketSegment\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"prodSpecCharValueUse\" : [ {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  }, {\n    \"minCardinality\" : 2,\n    \"productSpecification\" : {\n      \"@referredType\" : \"@referredType\",\n      \"targetProductSchema\" : {\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"@schemaLocation\" : \"@schemaLocation\"\n      },\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    },\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"valueType\" : \"valueType\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"productSpecCharacteristicValue\" : [ {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    }, {\n      \"rangeInterval\" : \"rangeInterval\",\n      \"isDefault\" : true,\n      \"regex\" : \"regex\",\n      \"valueTo\" : \"valueTo\",\n      \"unitOfMeasure\" : \"unitOfMeasure\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"valueType\" : \"valueType\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : { },\n      \"valueFrom\" : \"valueFrom\"\n    } ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"maxCardinality\" : 5\n  } ],\n  \"agreement\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"isSellable\" : true,\n  \"serviceLevelAgreement\" : {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"version\" : \"version\",\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"name\" : \"name\",\n  \"category\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"version\" : \"version\"\n  } ]\n}", ProductOffering.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOffering>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOffering>(HttpStatus.NOT_IMPLEMENTED);
    }

}
