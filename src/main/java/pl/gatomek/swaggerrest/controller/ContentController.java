package pl.gatomek.swaggerrest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import pl.gatomek.swaggerrest.data.CustomUuid;

import java.util.UUID;

@Api(value = "User Rest Controller", description = "REST API for User")
@Component
@RestController
@RequestMapping( path="/api")
public class ContentController {

    @ApiOperation( value="Getting string uuid", notes = "Getting string uuid", nickname = "GettingStringUuid")
    @ApiResponses( value = {
            @ApiResponse( code = 200, message = "It's OK")
            }
    )

    @GetMapping("/uuid")
    public String makeUuid( )
    {
        return UUID.randomUUID().toString();
    }

    @GetMapping( "/ext-uuid")
    public ResponseEntity<CustomUuid> makeCustomUuid()
    {
        return new ResponseEntity<>(new CustomUuid(), HttpStatus.OK);
    }

    @GetMapping( "/ext-ver-uuid")
    public ResponseEntity<CustomUuid> makeExtendedVersionUuid( @RequestParam( required = false, defaultValue = "4") int id )
    {
        return new ResponseEntity<>(new CustomUuid(), HttpStatus.OK);
    }

    @GetMapping( "/ext-ver-uuid2/{id}")
    public ResponseEntity<CustomUuid> makeExtendedVersionUuid2(@PathVariable int id )
    {
        return new ResponseEntity<>(new CustomUuid(), HttpStatus.OK);
    }
}
