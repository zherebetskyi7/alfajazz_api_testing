package settings;

import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/**
 * Created by yurii on 03.03.17.
 */
public class BaseUrls
{
    private static String year = "/2017";
    public static String BASE_URL = "https://leopolisjazz.com/en";


    // all pages
    public static String news_url = BASE_URL + year + "/news";
    // Program
    public static String shedule_url = BASE_URL + year + "/schedule";
    public static String stages_url = BASE_URL + year + "/stages";
    public static String street_music_url = BASE_URL + year + "/street-music";
    public static String master_classes_url = BASE_URL + year + "/activities/master-class";
    public static String jam_session_url = BASE_URL + year + "/activities/jam-session";
    public static String film_show_url = BASE_URL + year + "/activities/film-show";
    // Card
    public static String card_url = BASE_URL + "/alfa-jazz-card";
    // Award
    public static String award_url = BASE_URL + "/award";
    // Useful
    public static String location_url = BASE_URL + "/useful/location";
    public static String accomodation_url = BASE_URL + "/useful/accommodation";
    public static String how_to_get_flights_url = BASE_URL + "/useful/how-to-get/flights";
    public static String how_to_get_train_url = BASE_URL + "/useful/how-to-get/train";
    public static String how_to_get_transfer_url = BASE_URL + "/useful/how-to-get/transfer";
    // About Festival
    public static String about_url = BASE_URL + "/about";
    // Gallery
    public static String photos_url = BASE_URL + "/2016/photos";
    public static String videos_url = BASE_URL + "/2016/videos";
    // Partners
    public static String partners_url = BASE_URL + "/partners";
    // Archive
    public static String archive_url = BASE_URL + "/archive";
    // Loin-Us
    public static String join_musicians_url = BASE_URL + "/join-us/musicians";
    public static String join_street_music_url = BASE_URL + "/join-us/street-music";
    public static String join_press_url = BASE_URL + "/join-us/press";
    public static String join_volunteers_url = BASE_URL + "/join-us/volunteers";
    public static String join_tenders_url = BASE_URL + "/join-us/tenders";
    public static String join_partners_url = BASE_URL + "/join-us/become-partner";
    // Tickets
    public static String tickets_url = BASE_URL + "/tickets";
}
