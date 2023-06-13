package p000;

import co.bird.android.model.LinearRing;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import com.facebook.share.internal.C17296a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e"}, m28432d2 = {"LIX3;", "LBb6;", "Lco/bird/android/model/Polygon;", "Lcom/google/gson/stream/JsonWriter;", "writer", "value", "", "f", "Lcom/google/gson/stream/JsonReader;", "reader", "e", "<init>", "()V", C17296a.f69688o, "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPolygonTypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolygonTypeAdapter.kt\nco/bird/gson/android/typeadapters/PolygonTypeAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,127:1\n1549#2:128\n1620#2,3:129\n1855#2:132\n1856#2:135\n13579#3,2:133\n37#4,2:136\n37#4,2:138\n37#4,2:140\n*S KotlinDebug\n*F\n+ 1 PolygonTypeAdapter.kt\nco/bird/gson/android/typeadapters/PolygonTypeAdapter\n*L\n35#1:128\n35#1:129,3\n36#1:132\n36#1:135\n38#1:133,2\n65#1:136,2\n112#1:138,2\n124#1:140,2\n*E\n"})
/* renamed from: IX3 */
/* loaded from: classes4.dex */
public final class IX3 extends AbstractC31862Bb6<Polygon> {

    /* renamed from: a */
    public static final C3705a f15864a = new C3705a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"LIX3$a;", "", "", "LATITUDE", "Ljava/lang/String;", "LONGITUDE", "POINTS", "RINGS", "<init>", "()V", "gson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: IX3$a */
    /* loaded from: classes4.dex */
    public static final class C3705a {
        public /* synthetic */ C3705a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3705a() {
        }
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: e */
    public Polygon read(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (!reader.hasNext()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (reader.peek() == JsonToken.BEGIN_ARRAY) {
            reader.beginArray();
            while (reader.hasNext()) {
                reader.beginArray();
                ArrayList arrayList2 = new ArrayList();
                while (reader.hasNext()) {
                    reader.beginArray();
                    arrayList2.add(new Point(reader.nextDouble(), reader.nextDouble()));
                    reader.endArray();
                }
                arrayList.add(new LinearRing((Point[]) arrayList2.toArray(new Point[0])));
                reader.endArray();
            }
            reader.endArray();
        } else {
            reader.beginObject();
            if (!Intrinsics.areEqual(reader.nextName(), "rings")) {
                return null;
            }
            reader.beginArray();
            while (reader.hasNext()) {
                reader.beginObject();
                ArrayList arrayList3 = new ArrayList();
                if (Intrinsics.areEqual(reader.nextName(), "points")) {
                    reader.beginArray();
                    while (reader.hasNext()) {
                        if (reader.peek() == JsonToken.BEGIN_OBJECT) {
                            reader.beginObject();
                            Double d = null;
                            Double d2 = null;
                            while (reader.hasNext()) {
                                String nextName = reader.nextName();
                                if (Intrinsics.areEqual(nextName, "latitude")) {
                                    d = Double.valueOf(reader.nextDouble());
                                } else if (Intrinsics.areEqual(nextName, "longitude")) {
                                    d2 = Double.valueOf(reader.nextDouble());
                                }
                            }
                            if (d != null && d2 != null) {
                                arrayList3.add(new Point(d2.doubleValue(), d.doubleValue()));
                                reader.endObject();
                            } else {
                                throw new InvalidObjectException("Cannot deserialize point without latitude and longitude values");
                            }
                        } else {
                            reader.beginArray();
                            arrayList3.add(new Point(reader.nextDouble(), reader.nextDouble()));
                            reader.endArray();
                        }
                    }
                    reader.endArray();
                }
                arrayList.add(new LinearRing((Point[]) arrayList3.toArray(new Point[0])));
                reader.endObject();
            }
            reader.endArray();
            reader.endObject();
        }
        return new Polygon((LinearRing[]) arrayList.toArray(new LinearRing[0]));
    }

    @Override // p000.AbstractC31862Bb6
    /* renamed from: f */
    public void write(JsonWriter writer, Polygon polygon) {
        IntRange until;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (polygon == null) {
            writer.nullValue();
            return;
        }
        writer.beginArray();
        until = RangesKt___RangesKt.until(0, polygon.numRings());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList<LinearRing> arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(polygon.getRing(((IntIterator) it).nextInt()));
        }
        for (LinearRing linearRing : arrayList) {
            writer.beginArray();
            Point[] points = linearRing.getPoints();
            Intrinsics.checkNotNullExpressionValue(points, "ring.points");
            for (Point point : points) {
                writer.beginArray();
                writer.value(point.f66611x);
                writer.value(point.f66612y);
                writer.endArray();
            }
            writer.endArray();
        }
        writer.endArray();
    }
}
