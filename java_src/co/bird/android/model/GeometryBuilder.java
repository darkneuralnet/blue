package co.bird.android.model;

import co.bird.android.model.binary.BinaryParser;
import java.sql.SQLException;
/* loaded from: classes4.dex */
public class GeometryBuilder {
    public static final String SRIDPREFIX = "SRID=";

    public static Geometry geomFromString(String str) throws SQLException {
        return geomFromString(str, false);
    }

    public static String[] splitSRID(String str) throws SQLException {
        int indexOf = str.indexOf(59, 5);
        if (indexOf != -1) {
            return new String[]{str.substring(0, indexOf), str.substring(indexOf + 1)};
        }
        throw new SQLException("Error parsing Geometry - SRID not delimited with ';' ");
    }

    public static Geometry geomFromString(String str, boolean z) throws SQLException {
        return geomFromString(str, new BinaryParser(), z);
    }

    public static Geometry geomFromString(String str, BinaryParser binaryParser) throws SQLException {
        return geomFromString(str, binaryParser, false);
    }

    public static Geometry geomFromString(String str, BinaryParser binaryParser, boolean z) throws SQLException {
        Geometry parse;
        Geometry geometryCollection;
        String trim = str.trim();
        int i = 0;
        if (trim.startsWith(SRIDPREFIX)) {
            String[] splitSRID = splitSRID(trim);
            String trim2 = splitSRID[1].trim();
            i = Geometry.parseSRID(Integer.parseInt(splitSRID[0].substring(5)));
            trim = trim2;
        }
        if (!trim.startsWith("00") && !trim.startsWith("01")) {
            if (trim.endsWith("EMPTY")) {
                parse = new GeometryCollection();
            } else {
                if (trim.startsWith("MULTIPOLYGON")) {
                    geometryCollection = new MultiPolygon(trim, z);
                } else if (trim.startsWith("MULTILINESTRING")) {
                    geometryCollection = new MultiLineString(trim, z);
                } else if (trim.startsWith("MULTIPOINT")) {
                    geometryCollection = new MultiPoint(trim, z);
                } else if (trim.startsWith("POLYGON")) {
                    geometryCollection = new Polygon(trim, z);
                } else if (trim.startsWith("LINESTRING")) {
                    geometryCollection = new LineString(trim, z);
                } else if (trim.startsWith("POINT")) {
                    geometryCollection = new Point(trim, z);
                } else if (trim.startsWith(GeometryCollection.GeoCollID)) {
                    geometryCollection = new GeometryCollection(trim, z);
                } else {
                    throw new SQLException("Unknown type: " + trim);
                }
                parse = geometryCollection;
            }
        } else {
            parse = binaryParser.parse(trim);
        }
        if (i != 0) {
            parse.srid = i;
        }
        return parse;
    }
}
