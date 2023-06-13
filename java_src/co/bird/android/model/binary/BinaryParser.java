package co.bird.android.model.binary;

import co.bird.android.model.Geometry;
import co.bird.android.model.GeometryCollection;
import co.bird.android.model.LineString;
import co.bird.android.model.LinearRing;
import co.bird.android.model.MultiLineString;
import co.bird.android.model.MultiPoint;
import co.bird.android.model.MultiPolygon;
import co.bird.android.model.Point;
import co.bird.android.model.Polygon;
import co.bird.android.model.binary.ByteGetter;
import co.bird.android.model.binary.ValueGetter;
/* loaded from: classes4.dex */
public class BinaryParser {
    private GeometryCollection parseCollection(ValueGetter valueGetter) {
        Geometry[] geometryArr = new Geometry[valueGetter.getInt()];
        parseGeometryArray(valueGetter, geometryArr);
        return new GeometryCollection(geometryArr);
    }

    private void parseGeometryArray(ValueGetter valueGetter, Geometry[] geometryArr) {
        for (int i = 0; i < geometryArr.length; i++) {
            geometryArr[i] = parseGeometry(valueGetter);
        }
    }

    private LineString parseLineString(ValueGetter valueGetter, boolean z, boolean z2) {
        return new LineString(parsePointArray(valueGetter, z, z2));
    }

    private LinearRing parseLinearRing(ValueGetter valueGetter, boolean z, boolean z2) {
        return new LinearRing(parsePointArray(valueGetter, z, z2));
    }

    private MultiLineString parseMultiLineString(ValueGetter valueGetter) {
        LineString[] lineStringArr = new LineString[valueGetter.getInt()];
        parseGeometryArray(valueGetter, lineStringArr);
        return new MultiLineString(lineStringArr);
    }

    private MultiPoint parseMultiPoint(ValueGetter valueGetter) {
        Point[] pointArr = new Point[valueGetter.getInt()];
        parseGeometryArray(valueGetter, pointArr);
        return new MultiPoint(pointArr);
    }

    private MultiPolygon parseMultiPolygon(ValueGetter valueGetter) {
        Polygon[] polygonArr = new Polygon[valueGetter.getInt()];
        parseGeometryArray(valueGetter, polygonArr);
        return new MultiPolygon(polygonArr);
    }

    private Point parsePoint(ValueGetter valueGetter, boolean z, boolean z2) {
        Point point;
        double d = valueGetter.getDouble();
        double d2 = valueGetter.getDouble();
        if (z) {
            point = new Point(d, d2, valueGetter.getDouble());
        } else {
            point = new Point(d, d2);
        }
        if (z2) {
            point.setM(valueGetter.getDouble());
        }
        return point;
    }

    private Point[] parsePointArray(ValueGetter valueGetter, boolean z, boolean z2) {
        int i = valueGetter.getInt();
        Point[] pointArr = new Point[i];
        for (int i2 = 0; i2 < i; i2++) {
            pointArr[i2] = parsePoint(valueGetter, z, z2);
        }
        return pointArr;
    }

    private Polygon parsePolygon(ValueGetter valueGetter, boolean z, boolean z2) {
        int i = valueGetter.getInt();
        LinearRing[] linearRingArr = new LinearRing[i];
        for (int i2 = 0; i2 < i; i2++) {
            linearRingArr[i2] = parseLinearRing(valueGetter, z, z2);
        }
        return new Polygon(linearRingArr);
    }

    public static ValueGetter valueGetterForEndian(ByteGetter byteGetter) {
        if (byteGetter.get(0) == 0) {
            return new ValueGetter.XDR(byteGetter);
        }
        if (byteGetter.get(0) == 1) {
            return new ValueGetter.NDR(byteGetter);
        }
        int i = byteGetter.get(0);
        throw new IllegalArgumentException("Unknown Endian type:" + i);
    }

    public synchronized Geometry parse(String str) {
        return parseGeometry(valueGetterForEndian(new ByteGetter.StringByteGetter(str)));
    }

    public Geometry parseGeometry(ValueGetter valueGetter) {
        boolean z;
        boolean z2;
        Geometry parsePoint;
        if (valueGetter.getByte() == valueGetter.endian) {
            int i = valueGetter.getInt();
            int i2 = 536870911 & i;
            boolean z3 = true;
            int i3 = 0;
            if ((Integer.MIN_VALUE & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((1073741824 & i) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i & 536870912) == 0) {
                z3 = false;
            }
            if (z3) {
                i3 = Geometry.parseSRID(valueGetter.getInt());
            }
            switch (i2) {
                case 1:
                    parsePoint = parsePoint(valueGetter, z, z2);
                    break;
                case 2:
                    parsePoint = parseLineString(valueGetter, z, z2);
                    break;
                case 3:
                    parsePoint = parsePolygon(valueGetter, z, z2);
                    break;
                case 4:
                    parsePoint = parseMultiPoint(valueGetter);
                    break;
                case 5:
                    parsePoint = parseMultiLineString(valueGetter);
                    break;
                case 6:
                    parsePoint = parseMultiPolygon(valueGetter);
                    break;
                case 7:
                    parsePoint = parseCollection(valueGetter);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown Geometry Type: " + i2);
            }
            if (i3 != 0) {
                parsePoint.setSrid(i3);
            }
            return parsePoint;
        }
        throw new IllegalArgumentException("Endian inconsistency!");
    }

    public synchronized Geometry parse(byte[] bArr) {
        return parseGeometry(valueGetterForEndian(new ByteGetter.BinaryByteGetter(bArr)));
    }
}
