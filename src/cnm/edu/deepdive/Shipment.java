package cnm.edu.deepdive;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

  public class Shipment {

    public Shipment shipment;

    String initiation = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    List<TrackingInfo> tracking;

    public Date getInitiation() {
      Shipment shipment = new Shipment();
      shipment.initiation = (initiation);
      return getInitiation();
    }

    public void addTracking(TrackingInfo info) {
      tracking.add(info);
    }

    public List<TrackingInfo> getTracking() {

      return getTracking();
    }
  }
