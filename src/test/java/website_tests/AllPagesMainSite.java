package website_tests;

import org.testng.annotations.Test;

import javax.swing.text.html.HTML;

import static com.github.fge.jsonschema.core.keyword.syntax.dictionaries.DraftV4HyperSchemaSyntaxCheckerDictionary.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.hasXPath;
import static org.hamcrest.core.IsEqual.equalTo;
import static settings.BaseUrls.*;

import io.restassured.path.xml.exception.XmlPathException;

/**
 * Created by yurii on 06.03.17.
 */
public class AllPagesMainSite
{
    @Test
    public void verify_main_page_status()
    {
        given()
                .when()
                .get(BASE_URL)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Home | AlfaJazz"));
    }

    @Test
    public void verify_news_page()
    {
        given()
                .get(news_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("News | AlfaJazz"));
    }
    @Test
    public void shedule_news_page()
    {
        given()
                .get(shedule_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Schedule | AlfaJazz"));
    }
    @Test
    public void verify_stages_page()
    {
        given()
                .get(stages_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Stages | AlfaJazz"));
    }
    @Test
    public void verify_street_music_page()
    {
        given()
                .get(street_music_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Street Music | AlfaJazz"));
    }
    @Test
    public void verify_master_classes_page()
    {
        given()
                .get(master_classes_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Master Classes | AlfaJazz"));
    }
    @Test
    public void verify_jam_session_page()
    {
        given()
                .get(jam_session_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Jam sessions | AlfaJazz"));
    }
    @Test
    public void verify_film_shows_page()
    {
        given()
                .get(film_show_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Film Shows | AlfaJazz"));
    }
    @Test
    public void verify_card_page()
    {
        given()
                .get(card_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Alfa Jazz Card | AlfaJazz"));
    }
    @Test
    public void verify_award_page()
    {
        given()
                .get(award_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Award | AlfaJazz"));
    }
    @Test
    public void verify_location_page()
    {
        given()
                .get(location_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Location | AlfaJazz"));
    }
    @Test
    public void verify_accomodation_page()
    {
        given()
                .get(accomodation_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Accommodation | AlfaJazz"));
    }
    @Test
    public void verify_howToGet_flight_page()
    {
        given()
                .get(how_to_get_flights_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Flights | AlfaJazz"));
    }
    @Test
    public void verify_howToGet_train_page()
    {
        given()
                .get(how_to_get_train_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Train | AlfaJazz"));
    }
    @Test
    public void verify_howToGet_transfer_page()
    {
        given()
                .get(how_to_get_transfer_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Transfer | AlfaJazz"));
    }
    @Test
    public void verify_festival_page()
    {
        given()
                .get(about_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("About Festival | AlfaJazz"));
    }
    @Test
    public void verify_gallery_photos_page()
    {
        given()
                .get(photos_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Photos | AlfaJazz"));
    }
    @Test
    public void verify_gallery_videos_page()
    {
        given()
                .get(videos_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Videos | AlfaJazz"));
    }
    @Test
    public void verify_partners_page()
    {
        given()
                .get(partners_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Partners | AlfaJazz"));
    }
    @Test
    public void verify_archieve_page()
    {
        given()
                .get(archive_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Archive | AlfaJazz"));
    }

    /*
    *           JOIN US
    * */

    @Test
    public void verify_joinUs_musicians_page()
    {
        given()
                .get(join_musicians_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Musicians | AlfaJazz"));
    }
    @Test
    public void verify_joinUs_street_music_page()
    {
        given()
                .get(join_street_music_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Street Music | AlfaJazz"));
    }
    @Test
    public void verify_press_page()
    {
        given()
                .get(join_press_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Press | AlfaJazz"));
    }
    @Test
    public void verify_joinUs_volunteers_page()
    {
        given()
                .get(join_volunteers_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Volunteers | AlfaJazz"));
    }
    @Test
    public void verify_joinUs_tenders_page()
    {
        given()
                .get(join_tenders_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Tenders | AlfaJazz"));
    }
    @Test
    public void verify_joinUs_become_partner_page()
    {
        given()
                .get(join_partners_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Become partner | AlfaJazz"));
    }

    /*
    *           Tickets
    * */
    @Test
    public void verify_tickets_page()
    {
        given()
                .get(tickets_url)
                .then()
                .statusCode(200)
                .body("html.head.title", equalTo("Tickets | AlfaJazz"));
    }
}
