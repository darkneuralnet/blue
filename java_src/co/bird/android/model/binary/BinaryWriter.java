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
import co.bird.android.model.binary.ByteSetter;
import co.bird.android.model.binary.ValueSetter;
/* loaded from: classes4.dex */
public class BinaryWriter {
    private int estimateCollection(GeometryCollection geometryCollection) {
        return estimateGeometryArray(geometryCollection.getGeometries()) + 4;
    }

    private int estimateGeometryArray(Geometry[] geometryArr) {
        int i = 0;
        for (Geometry geometry : geometryArr) {
            i += estimateBytes(geometry);
        }
        return i;
    }

    private int estimateLineString(LineString lineString) {
        return estimatePointArray(lineString.getPoints());
    }

    private int estimateLinearRing(LinearRing linearRing) {
        return estimatePointArray(linearRing.getPoints());
    }

    private int estimateMultiLineString(MultiLineString multiLineString) {
        return estimateGeometryArray(multiLineString.getLines()) + 4;
    }

    private int estimateMultiPoint(MultiPoint multiPoint) {
        if (multiPoint.numPoints() <= 0) {
            return 4;
        }
        return 4 + (multiPoint.numPoints() * estimateBytes(multiPoint.getFirstPoint()));
    }

    private int estimateMultiPolygon(MultiPolygon multiPolygon) {
        return estimateGeometryArray(multiPolygon.getPolygons()) + 4;
    }

    private int estimatePoint(Point point) {
        int i;
        if (point.dimension == 3) {
            i = 24;
        } else {
            i = 16;
        }
        if (point.haveMeasure) {
            return i + 8;
        }
        return i;
    }

    private int estimatePointArray(Point[] pointArr) {
        if (pointArr.length <= 0) {
            return 4;
        }
        return 4 + (pointArr.length * estimatePoint(pointArr[0]));
    }

    private int estimatePolygon(Polygon polygon) {
        int i = 4;
        for (int i2 = 0; i2 < polygon.numRings(); i2++) {
            i += estimateLinearRing(polygon.getRing(i2));
        }
        return i;
    }

    public static ValueSetter valueSetterForEndian(ByteSetter byteSetter, byte b) {
        if (b == 0) {
            return new ValueSetter.XDR(byteSetter);
        }
        if (b == 1) {
            return new ValueSetter.NDR(byteSetter);
        }
        throw new IllegalArgumentException("Unknown Endian type:" + ((int) b));
    }

    private void writeCollection(GeometryCollection geometryCollection, ValueSetter valueSetter) {
        valueSetter.setInt(geometryCollection.numGeoms());
        writeGeometryArray(geometryCollection.getGeometries(), valueSetter);
    }

    private void writeGeometryArray(Geometry[] geometryArr, ValueSetter valueSetter) {
        for (Geometry geometry : geometryArr) {
            writeGeometry(geometry, valueSetter);
        }
    }

    private void writeLineString(LineString lineString, ValueSetter valueSetter) {
        writePointArray(lineString.getPoints(), valueSetter);
    }

    private void writeLinearRing(LinearRing linearRing, ValueSetter valueSetter) {
        writePointArray(linearRing.getPoints(), valueSetter);
    }

    private void writeMultiLineString(MultiLineString multiLineString, ValueSetter valueSetter) {
        valueSetter.setInt(multiLineString.numLines());
        writeGeometryArray(multiLineString.getLines(), valueSetter);
    }

    private void writeMultiPoint(MultiPoint multiPoint, ValueSetter valueSetter) {
        valueSetter.setInt(multiPoint.numPoints());
        writeGeometryArray(multiPoint.getPoints(), valueSetter);
    }

    private void writeMultiPolygon(MultiPolygon multiPolygon, ValueSetter valueSetter) {
        valueSetter.setInt(multiPolygon.numPolygons());
        writeGeometryArray(multiPolygon.getPolygons(), valueSetter);
    }

    private void writePoint(Point point, ValueSetter valueSetter) {
        valueSetter.setDouble(point.f66611x);
        valueSetter.setDouble(point.f66612y);
        if (point.dimension == 3) {
            valueSetter.setDouble(point.f66613z);
        }
        if (point.haveMeasure) {
            valueSetter.setDouble(point.f66610m);
        }
    }

    private void writePointArray(Point[] pointArr, ValueSetter valueSetter) {
        valueSetter.setInt(pointArr.length);
        for (Point point : pointArr) {
            writePoint(point, valueSetter);
        }
    }

    private void writePolygon(Polygon polygon, ValueSetter valueSetter) {
        valueSetter.setInt(polygon.numRings());
        for (int i = 0; i < polygon.numRings(); i++) {
            writeLinearRing(polygon.getRing(i), valueSetter);
        }
    }

    public int estimateBytes(Geometry geometry) {
        int i;
        int estimatePoint;
        if (geometry.srid != 0) {
            i = 9;
        } else {
            i = 5;
        }
        switch (geometry.type) {
            case 1:
                estimatePoint = estimatePoint((Point) geometry);
                break;
            case 2:
                estimatePoint = estimateLineString((LineString) geometry);
                break;
            case 3:
                estimatePoint = estimatePolygon((Polygon) geometry);
                break;
            case 4:
                estimatePoint = estimateMultiPoint((MultiPoint) geometry);
                break;
            case 5:
                estimatePoint = estimateMultiLineString((MultiLineString) geometry);
                break;
            case 6:
                estimatePoint = estimateMultiPolygon((MultiPolygon) geometry);
                break;
            case 7:
                estimatePoint = estimateCollection((GeometryCollection) geometry);
                break;
            default:
                int i2 = geometry.type;
                throw new IllegalArgumentException("Unknown Geometry Type: " + i2);
        }
        return i + estimatePoint;
    }

    public synchronized byte[] writeBinary(Geometry geometry, byte b) {
        ByteSetter.BinaryByteSetter binaryByteSetter;
        binaryByteSetter = new ByteSetter.BinaryByteSetter(estimateBytes(geometry));
        writeGeometry(geometry, valueSetterForEndian(binaryByteSetter, b));
        return binaryByteSetter.result();
    }

    public void writeGeometry(Geometry geometry, ValueSetter valueSetter) {
        valueSetter.setByte(valueSetter.endian);
        int i = geometry.type;
        if (geometry.dimension == 3) {
            i |= Integer.MIN_VALUE;
        }
        if (geometry.haveMeasure) {
            i |= 1073741824;
        }
        if (geometry.srid != 0) {
            i |= 536870912;
        }
        valueSetter.setInt(i);
        int i2 = geometry.srid;
        if (i2 != 0) {
            valueSetter.setInt(i2);
        }
        switch (geometry.type) {
            case 1:
                writePoint((Point) geometry, valueSetter);
                return;
            case 2:
                writeLineString((LineString) geometry, valueSetter);
                return;
            case 3:
                writePolygon((Polygon) geometry, valueSetter);
                return;
            case 4:
                writeMultiPoint((MultiPoint) geometry, valueSetter);
                return;
            case 5:
                writeMultiLineString((MultiLineString) geometry, valueSetter);
                return;
            case 6:
                writeMultiPolygon((MultiPolygon) geometry, valueSetter);
                return;
            case 7:
                writeCollection((GeometryCollection) geometry, valueSetter);
                return;
            default:
                int i3 = geometry.type;
                throw new IllegalArgumentException("Unknown Geometry Type: " + i3);
        }
    }

    public synchronized String writeHexed(Geometry geometry, byte b) {
        ByteSetter.StringByteSetter stringByteSetter;
        stringByteSetter = new ByteSetter.StringByteSetter(estimateBytes(geometry));
        writeGeometry(geometry, valueSetterForEndian(stringByteSetter, b));
        return stringByteSetter.result();
    }

    public synchronized byte[] writeBinary(Geometry geometry) {
        return writeBinary(geometry, (byte) 1);
    }

    public synchronized String writeHexed(Geometry geometry) {
        return writeHexed(geometry, (byte) 1);
    }
}
