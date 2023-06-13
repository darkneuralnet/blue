package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.stripe.android.StripePaymentController;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: AO6 */
/* loaded from: classes8.dex */
public class AO6 extends AbstractRunnableC45044mM6 implements SensorEventListener {

    /* renamed from: c */
    public Sensor f473c;

    /* renamed from: d */
    public SensorManager f474d;

    /* renamed from: e */
    public JSONObject f475e;

    /* renamed from: f */
    public JSONArray f476f;

    /* renamed from: g */
    public Handler f477g;

    /* renamed from: h */
    public JSONArray f478h;

    /* renamed from: i */
    public int f479i;

    /* renamed from: j */
    public long f480j = 0;

    public AO6(Context context, Handler handler, int i) {
        this.f477g = handler;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f474d = sensorManager;
        this.f479i = i;
        this.f473c = sensorManager.getDefaultSensor(i);
    }

    /* renamed from: b */
    public void m115836b() {
        this.f475e = new JSONObject();
        this.f478h = new JSONArray();
        this.f476f = new JSONArray();
        m25795a();
    }

    /* renamed from: c */
    public final void m115835c(SensorManager sensorManager) {
        m115832f(sensorManager);
    }

    /* renamed from: d */
    public JSONObject m115834d() {
        if (this.f473c == null) {
            return new JSONObject();
        }
        m115831g(this.f474d);
        m115830h();
        return this.f475e;
    }

    /* renamed from: e */
    public void m115833e() {
        m115835c(this.f474d);
    }

    /* renamed from: f */
    public final void m115832f(SensorManager sensorManager) {
        try {
            Sensor sensor = this.f473c;
            if (sensor != null) {
                sensorManager.registerListener(this, sensor, StripePaymentController.PAYMENT_REQUEST_CODE, this.f477g);
                JSONObject m1467i = C52760zN6.m1467i(this.f475e, C52760zN6.m1468h(this.f473c));
                this.f475e = m1467i;
                if (this.f479i == 1) {
                    m1467i.put(TL6.SENSOR_TYPE.toString(), EnumC41486gM6.AC.toString());
                }
                if (this.f479i == 4) {
                    this.f475e.put(TL6.SENSOR_TYPE.toString(), EnumC41486gM6.GY.toString());
                }
                if (this.f479i == 2) {
                    this.f475e.put(TL6.SENSOR_TYPE.toString(), EnumC41486gM6.MG.toString());
                }
            }
        } catch (JSONException e) {
            KJ6.m99011b(getClass(), 3, e);
        }
    }

    /* renamed from: g */
    public final void m115831g(SensorManager sensorManager) {
        sensorManager.unregisterListener(this);
    }

    /* renamed from: h */
    public final void m115830h() {
        try {
            this.f475e.put(TL6.SENSOR_PAYLOAD.toString(), this.f478h);
            this.f476f.put(this.f475e);
        } catch (JSONException e) {
            KJ6.m99011b(getClass(), 3, e);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f480j <= 25 || this.f478h.length() >= 150) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(String.valueOf(sensorEvent.values[0]));
        jSONArray.put(String.valueOf(sensorEvent.values[1]));
        jSONArray.put(String.valueOf(sensorEvent.values[2]));
        jSONArray.put(currentTimeMillis);
        this.f478h.put(jSONArray);
        this.f480j = currentTimeMillis;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f477g == null) {
            return;
        }
        m115833e();
    }
}
