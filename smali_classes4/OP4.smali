.class public final LOP4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/analytics/AnalyticsEvent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u000c\n\u0002\u0010 \n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008f\n\u0002\u0010$\n\u0002\u0008\u0008\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00e7\u0003\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0010\u0008\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d\u0012\u0010\u0008\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J\u008a\u0004\u00104\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u000e2\u0010\u0008\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d2\u0010\u0008\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u00084\u00105J\t\u00106\u001a\u00020\u0002H\u00d6\u0001J\t\u00108\u001a\u000207H\u00d6\u0001J\u0013\u0010;\u001a\u00020\u00072\u0008\u0010:\u001a\u0004\u0018\u000109H\u00d6\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010<\u001a\u0004\u0008=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010BR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008C\u0010@\u001a\u0004\u0008D\u0010BR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008\u0008\u0010GR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008H\u0010F\u001a\u0004\u0008I\u0010GR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008J\u0010F\u001a\u0004\u0008\n\u0010GR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008K\u0010F\u001a\u0004\u0008L\u0010GR\u0017\u0010\u000c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008M\u0010<\u001a\u0004\u0008N\u0010>R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008O\u0010<\u001a\u0004\u0008P\u0010>R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008Q\u0010R\u001a\u0004\u0008S\u0010TR\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008U\u0010V\u001a\u0004\u0008W\u0010XR\u0017\u0010\u0012\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008Y\u0010@\u001a\u0004\u0008Z\u0010BR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008[\u0010R\u001a\u0004\u0008\\\u0010TR\u0017\u0010\u0014\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008]\u0010R\u001a\u0004\u0008^\u0010TR\u0017\u0010\u0015\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008_\u0010R\u001a\u0004\u0008`\u0010TR\u0017\u0010\u0016\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008a\u0010R\u001a\u0004\u0008b\u0010TR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008c\u0010<\u001a\u0004\u0008d\u0010>R\u0017\u0010\u0018\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008e\u0010<\u001a\u0004\u0008f\u0010>R\u0017\u0010\u0019\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008g\u0010h\u001a\u0004\u0008i\u0010jR\u0017\u0010\u001a\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008k\u0010R\u001a\u0004\u0008l\u0010TR\u0017\u0010\u001b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008m\u0010@\u001a\u0004\u0008n\u0010BR\u0017\u0010\u001c\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008o\u0010R\u001a\u0004\u0008p\u0010TR\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010tR\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008u\u0010r\u001a\u0004\u0008v\u0010tR\u0019\u0010 \u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008w\u0010F\u001a\u0004\u0008x\u0010GR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008y\u0010<\u001a\u0004\u0008z\u0010>R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008{\u0010<\u001a\u0004\u0008|\u0010>R\u0019\u0010#\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008}\u0010F\u001a\u0004\u0008#\u0010GR\u001b\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000e\n\u0004\u0008~\u0010\u007f\u001a\u0006\u0008\u0080\u0001\u0010\u0081\u0001R\u001a\u0010%\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\r\n\u0004\u0008V\u0010<\u001a\u0005\u0008\u0082\u0001\u0010>R\u001d\u0010&\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u001d\u0010\'\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0087\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u0088\u0001\u0010\u0086\u0001R\u001d\u0010(\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0089\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u008a\u0001\u0010\u0086\u0001R\u001b\u0010)\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000e\n\u0005\u0008\u008b\u0001\u0010F\u001a\u0005\u0008\u008c\u0001\u0010GR\u001d\u0010*\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u008d\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u0086\u0001R\u001c\u0010+\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000f\n\u0005\u0008R\u0010\u0084\u0001\u001a\u0006\u0008\u008f\u0001\u0010\u0086\u0001R\u001d\u0010,\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0090\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u0091\u0001\u0010\u0086\u0001R\u001b\u0010-\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000e\n\u0005\u0008\u0092\u0001\u0010F\u001a\u0005\u0008\u0093\u0001\u0010GR\u001d\u0010.\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0094\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u0095\u0001\u0010\u0086\u0001R\u001d\u0010/\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0096\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u0097\u0001\u0010\u0086\u0001R\u001d\u00100\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0098\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u0099\u0001\u0010\u0086\u0001R\u001b\u00101\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000e\n\u0005\u0008\u009a\u0001\u0010F\u001a\u0005\u0008\u009b\u0001\u0010GR\u001d\u00102\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u009c\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u009d\u0001\u0010\u0086\u0001R\u001d\u00103\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u0010\n\u0006\u0008\u009e\u0001\u0010\u0084\u0001\u001a\u0006\u0008\u009f\u0001\u0010\u0086\u0001R&\u0010\u00a3\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001090\u00a0\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R\u0016\u0010\u00a5\u0001\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00a4\u0001\u0010>\u00a8\u0006\u00a8\u0001"
    }
    d2 = {
        "LOP4;",
        "Lco/bird/android/model/analytics/AnalyticsEvent;",
        "",
        "eventId",
        "Lorg/joda/time/DateTime;",
        "eventTime",
        "clientTime",
        "",
        "isBluetoothBird",
        "birdIsBluetooth",
        "isCellularBird",
        "birdIsCellular",
        "birdModel",
        "currency",
        "",
        "distanceInMeters",
        "",
        "durationInSeconds",
        "endTime",
        "receiptPrice",
        "minimumRidePrice",
        "minutePrice",
        "minutesIncluded",
        "partnerId",
        "rideId",
        "hasSalesTax",
        "startPrice",
        "startTime",
        "ridePrice",
        "",
        "areaIds",
        "timeInAreas",
        "hadToParkInNest",
        "nearestNestId",
        "nestStatus",
        "isPrimaryRide",
        "concurrentRideCount",
        "endRideAttemptId",
        "arLatitude",
        "arLongitude",
        "arAccuracy",
        "arLocationMocked",
        "birdLatitude",
        "birdLongitude",
        "birdAccuracy",
        "birdLocationMocked",
        "gpsLatitude",
        "gpsLongitude",
        "gpsAccuracy",
        "gpsLocationMocked",
        "accuracyLimit",
        "nestAdditionalBufferMeters",
        "a",
        "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)LOP4;",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "Ljava/lang/String;",
        "getEventId",
        "()Ljava/lang/String;",
        "b",
        "Lorg/joda/time/DateTime;",
        "getEventTime",
        "()Lorg/joda/time/DateTime;",
        "c",
        "getClientTime",
        "d",
        "Ljava/lang/Boolean;",
        "()Ljava/lang/Boolean;",
        "e",
        "getBirdIsBluetooth",
        "f",
        "g",
        "getBirdIsCellular",
        "h",
        "getBirdModel",
        "i",
        "getCurrency",
        "j",
        "J",
        "getDistanceInMeters",
        "()J",
        "k",
        "D",
        "getDurationInSeconds",
        "()D",
        "l",
        "getEndTime",
        "m",
        "getReceiptPrice",
        "n",
        "getMinimumRidePrice",
        "o",
        "getMinutePrice",
        "p",
        "getMinutesIncluded",
        "q",
        "getPartnerId",
        "r",
        "getRideId",
        "s",
        "Z",
        "getHasSalesTax",
        "()Z",
        "t",
        "getStartPrice",
        "u",
        "getStartTime",
        "v",
        "getRidePrice",
        "w",
        "Ljava/util/List;",
        "getAreaIds",
        "()Ljava/util/List;",
        "x",
        "getTimeInAreas",
        "y",
        "getHadToParkInNest",
        "z",
        "getNearestNestId",
        "A",
        "getNestStatus",
        "B",
        "C",
        "Ljava/lang/Long;",
        "getConcurrentRideCount",
        "()Ljava/lang/Long;",
        "getEndRideAttemptId",
        "E",
        "Ljava/lang/Double;",
        "getArLatitude",
        "()Ljava/lang/Double;",
        "F",
        "getArLongitude",
        "G",
        "getArAccuracy",
        "H",
        "getArLocationMocked",
        "I",
        "getBirdLatitude",
        "getBirdLongitude",
        "K",
        "getBirdAccuracy",
        "L",
        "getBirdLocationMocked",
        "M",
        "getGpsLatitude",
        "N",
        "getGpsLongitude",
        "O",
        "getGpsAccuracy",
        "P",
        "getGpsLocationMocked",
        "Q",
        "getAccuracyLimit",
        "R",
        "getNestAdditionalBufferMeters",
        "",
        "getProperties",
        "()Ljava/util/Map;",
        "properties",
        "getName",
        "name",
        "<init>",
        "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V",
        "model-analytics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final A:Ljava/lang/String;

.field public final B:Ljava/lang/Boolean;

.field public final C:Ljava/lang/Long;

.field public final D:Ljava/lang/String;

.field public final E:Ljava/lang/Double;

.field public final F:Ljava/lang/Double;

.field public final G:Ljava/lang/Double;

.field public final H:Ljava/lang/Boolean;

.field public final I:Ljava/lang/Double;

.field public final J:Ljava/lang/Double;

.field public final K:Ljava/lang/Double;

.field public final L:Ljava/lang/Boolean;

.field public final M:Ljava/lang/Double;

.field public final N:Ljava/lang/Double;

.field public final O:Ljava/lang/Double;

.field public final P:Ljava/lang/Boolean;

.field public final Q:Ljava/lang/Double;

.field public final R:Ljava/lang/Double;

.field public final a:Ljava/lang/String;

.field public final b:Lorg/joda/time/DateTime;

.field public final c:Lorg/joda/time/DateTime;

.field public final d:Ljava/lang/Boolean;

.field public final e:Ljava/lang/Boolean;

.field public final f:Ljava/lang/Boolean;

.field public final g:Ljava/lang/Boolean;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:J

.field public final k:D

.field public final l:Lorg/joda/time/DateTime;

.field public final m:J

.field public final n:J

.field public final o:J

.field public final p:J

.field public final q:Ljava/lang/String;

.field public final r:Ljava/lang/String;

.field public final s:Z

.field public final t:J

.field public final u:Lorg/joda/time/DateTime;

.field public final v:J

.field public final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Ljava/lang/Boolean;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JD",
            "Lorg/joda/time/DateTime;",
            "JJJJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZJ",
            "Lorg/joda/time/DateTime;",
            "J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object/from16 v6, p14

    move-object/from16 v7, p24

    move-object/from16 v8, p28

    const-string v9, "eventId"

    invoke-static {p1, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "eventTime"

    invoke-static {p2, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "clientTime"

    invoke-static {p3, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "birdModel"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "currency"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "endTime"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "rideId"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "startTime"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, LOP4;->a:Ljava/lang/String;

    iput-object v2, v0, LOP4;->b:Lorg/joda/time/DateTime;

    iput-object v3, v0, LOP4;->c:Lorg/joda/time/DateTime;

    move-object v1, p4

    iput-object v1, v0, LOP4;->d:Ljava/lang/Boolean;

    move-object v1, p5

    iput-object v1, v0, LOP4;->e:Ljava/lang/Boolean;

    move-object/from16 v1, p6

    iput-object v1, v0, LOP4;->f:Ljava/lang/Boolean;

    move-object/from16 v1, p7

    iput-object v1, v0, LOP4;->g:Ljava/lang/Boolean;

    iput-object v4, v0, LOP4;->h:Ljava/lang/String;

    iput-object v5, v0, LOP4;->i:Ljava/lang/String;

    move-wide/from16 v1, p10

    iput-wide v1, v0, LOP4;->j:J

    move-wide/from16 v1, p12

    iput-wide v1, v0, LOP4;->k:D

    iput-object v6, v0, LOP4;->l:Lorg/joda/time/DateTime;

    move-wide/from16 v1, p15

    iput-wide v1, v0, LOP4;->m:J

    move-wide/from16 v1, p17

    iput-wide v1, v0, LOP4;->n:J

    move-wide/from16 v1, p19

    iput-wide v1, v0, LOP4;->o:J

    move-wide/from16 v1, p21

    iput-wide v1, v0, LOP4;->p:J

    move-object/from16 v1, p23

    iput-object v1, v0, LOP4;->q:Ljava/lang/String;

    iput-object v7, v0, LOP4;->r:Ljava/lang/String;

    move/from16 v1, p25

    iput-boolean v1, v0, LOP4;->s:Z

    move-wide/from16 v1, p26

    iput-wide v1, v0, LOP4;->t:J

    iput-object v8, v0, LOP4;->u:Lorg/joda/time/DateTime;

    move-wide/from16 v1, p29

    iput-wide v1, v0, LOP4;->v:J

    move-object/from16 v1, p31

    iput-object v1, v0, LOP4;->w:Ljava/util/List;

    move-object/from16 v1, p32

    iput-object v1, v0, LOP4;->x:Ljava/util/List;

    move-object/from16 v1, p33

    iput-object v1, v0, LOP4;->y:Ljava/lang/Boolean;

    move-object/from16 v1, p34

    iput-object v1, v0, LOP4;->z:Ljava/lang/String;

    move-object/from16 v1, p35

    iput-object v1, v0, LOP4;->A:Ljava/lang/String;

    move-object/from16 v1, p36

    iput-object v1, v0, LOP4;->B:Ljava/lang/Boolean;

    move-object/from16 v1, p37

    iput-object v1, v0, LOP4;->C:Ljava/lang/Long;

    move-object/from16 v1, p38

    iput-object v1, v0, LOP4;->D:Ljava/lang/String;

    move-object/from16 v1, p39

    iput-object v1, v0, LOP4;->E:Ljava/lang/Double;

    move-object/from16 v1, p40

    iput-object v1, v0, LOP4;->F:Ljava/lang/Double;

    move-object/from16 v1, p41

    iput-object v1, v0, LOP4;->G:Ljava/lang/Double;

    move-object/from16 v1, p42

    iput-object v1, v0, LOP4;->H:Ljava/lang/Boolean;

    move-object/from16 v1, p43

    iput-object v1, v0, LOP4;->I:Ljava/lang/Double;

    move-object/from16 v1, p44

    iput-object v1, v0, LOP4;->J:Ljava/lang/Double;

    move-object/from16 v1, p45

    iput-object v1, v0, LOP4;->K:Ljava/lang/Double;

    move-object/from16 v1, p46

    iput-object v1, v0, LOP4;->L:Ljava/lang/Boolean;

    move-object/from16 v1, p47

    iput-object v1, v0, LOP4;->M:Ljava/lang/Double;

    move-object/from16 v1, p48

    iput-object v1, v0, LOP4;->N:Ljava/lang/Double;

    move-object/from16 v1, p49

    iput-object v1, v0, LOP4;->O:Ljava/lang/Double;

    move-object/from16 v1, p50

    iput-object v1, v0, LOP4;->P:Ljava/lang/Boolean;

    move-object/from16 v1, p51

    iput-object v1, v0, LOP4;->Q:Ljava/lang/Double;

    move-object/from16 v1, p52

    iput-object v1, v0, LOP4;->R:Ljava/lang/Double;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 56

    move/from16 v0, p54

    and-int/lit8 v1, p53, 0x1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "randomUUID().toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, p53, 0x2

    const-string v2, "now()"

    if-eqz v1, :cond_1

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, p53, 0x4

    if-eqz v1, :cond_2

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v1, p53, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object v7, v2

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v1, p53, 0x10

    if-eqz v1, :cond_4

    move-object v8, v2

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v1, p53, 0x20

    if-eqz v1, :cond_5

    move-object v9, v2

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v1, p53, 0x40

    if-eqz v1, :cond_6

    move-object v10, v2

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    const/high16 v1, 0x10000

    and-int v1, p53, v1

    if-eqz v1, :cond_7

    move-object/from16 v26, v2

    goto :goto_7

    :cond_7
    move-object/from16 v26, p23

    :goto_7
    const/high16 v1, 0x400000

    and-int v1, p53, v1

    if-eqz v1, :cond_8

    move-object/from16 v34, v2

    goto :goto_8

    :cond_8
    move-object/from16 v34, p31

    :goto_8
    const/high16 v1, 0x800000

    and-int v1, p53, v1

    if-eqz v1, :cond_9

    move-object/from16 v35, v2

    goto :goto_9

    :cond_9
    move-object/from16 v35, p32

    :goto_9
    const/high16 v1, 0x1000000

    and-int v1, p53, v1

    if-eqz v1, :cond_a

    move-object/from16 v36, v2

    goto :goto_a

    :cond_a
    move-object/from16 v36, p33

    :goto_a
    const/high16 v1, 0x2000000

    and-int v1, p53, v1

    if-eqz v1, :cond_b

    move-object/from16 v37, v2

    goto :goto_b

    :cond_b
    move-object/from16 v37, p34

    :goto_b
    const/high16 v1, 0x4000000

    and-int v1, p53, v1

    if-eqz v1, :cond_c

    move-object/from16 v38, v2

    goto :goto_c

    :cond_c
    move-object/from16 v38, p35

    :goto_c
    const/high16 v1, 0x8000000

    and-int v1, p53, v1

    if-eqz v1, :cond_d

    move-object/from16 v39, v2

    goto :goto_d

    :cond_d
    move-object/from16 v39, p36

    :goto_d
    const/high16 v1, 0x10000000

    and-int v1, p53, v1

    if-eqz v1, :cond_e

    move-object/from16 v40, v2

    goto :goto_e

    :cond_e
    move-object/from16 v40, p37

    :goto_e
    const/high16 v1, 0x20000000

    and-int v1, p53, v1

    if-eqz v1, :cond_f

    move-object/from16 v41, v2

    goto :goto_f

    :cond_f
    move-object/from16 v41, p38

    :goto_f
    const/high16 v1, 0x40000000    # 2.0f

    and-int v1, p53, v1

    if-eqz v1, :cond_10

    move-object/from16 v42, v2

    goto :goto_10

    :cond_10
    move-object/from16 v42, p39

    :goto_10
    const/high16 v1, -0x80000000

    and-int v1, p53, v1

    if-eqz v1, :cond_11

    move-object/from16 v43, v2

    goto :goto_11

    :cond_11
    move-object/from16 v43, p40

    :goto_11
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_12

    move-object/from16 v44, v2

    goto :goto_12

    :cond_12
    move-object/from16 v44, p41

    :goto_12
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_13

    move-object/from16 v45, v2

    goto :goto_13

    :cond_13
    move-object/from16 v45, p42

    :goto_13
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_14

    move-object/from16 v46, v2

    goto :goto_14

    :cond_14
    move-object/from16 v46, p43

    :goto_14
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_15

    move-object/from16 v47, v2

    goto :goto_15

    :cond_15
    move-object/from16 v47, p44

    :goto_15
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_16

    move-object/from16 v48, v2

    goto :goto_16

    :cond_16
    move-object/from16 v48, p45

    :goto_16
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_17

    move-object/from16 v49, v2

    goto :goto_17

    :cond_17
    move-object/from16 v49, p46

    :goto_17
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_18

    move-object/from16 v50, v2

    goto :goto_18

    :cond_18
    move-object/from16 v50, p47

    :goto_18
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_19

    move-object/from16 v51, v2

    goto :goto_19

    :cond_19
    move-object/from16 v51, p48

    :goto_19
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_1a

    move-object/from16 v52, v2

    goto :goto_1a

    :cond_1a
    move-object/from16 v52, p49

    :goto_1a
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1b

    move-object/from16 v53, v2

    goto :goto_1b

    :cond_1b
    move-object/from16 v53, p50

    :goto_1b
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_1c

    move-object/from16 v54, v2

    goto :goto_1c

    :cond_1c
    move-object/from16 v54, p51

    :goto_1c
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_1d

    move-object/from16 v55, v2

    goto :goto_1d

    :cond_1d
    move-object/from16 v55, p52

    :goto_1d
    move-object/from16 v3, p0

    move-object/from16 v11, p8

    move-object/from16 v12, p9

    move-wide/from16 v13, p10

    move-wide/from16 v15, p12

    move-object/from16 v17, p14

    move-wide/from16 v18, p15

    move-wide/from16 v20, p17

    move-wide/from16 v22, p19

    move-wide/from16 v24, p21

    move-object/from16 v27, p24

    move/from16 v28, p25

    move-wide/from16 v29, p26

    move-object/from16 v31, p28

    move-wide/from16 v32, p29

    invoke-direct/range {v3 .. v55}, LOP4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V

    return-void
.end method

.method public static synthetic copy$default(LOP4;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;IILjava/lang/Object;)LOP4;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p53

    move/from16 v2, p54

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, LOP4;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, LOP4;->b:Lorg/joda/time/DateTime;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, LOP4;->c:Lorg/joda/time/DateTime;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, LOP4;->d:Ljava/lang/Boolean;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, LOP4;->e:Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, LOP4;->f:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, LOP4;->g:Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, LOP4;->h:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, LOP4;->i:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-wide v12, v0, LOP4;->j:J

    goto :goto_9

    :cond_9
    move-wide/from16 v12, p10

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-wide v14, v0, LOP4;->k:D

    goto :goto_a

    :cond_a
    move-wide/from16 v14, p12

    :goto_a
    move-wide/from16 p12, v14

    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, LOP4;->l:Lorg/joda/time/DateTime;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p14

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    move-object/from16 p14, v14

    if-eqz v15, :cond_c

    iget-wide v14, v0, LOP4;->m:J

    goto :goto_c

    :cond_c
    move-wide/from16 v14, p15

    :goto_c
    move-wide/from16 p15, v14

    and-int/lit16 v14, v1, 0x2000

    if-eqz v14, :cond_d

    iget-wide v14, v0, LOP4;->n:J

    goto :goto_d

    :cond_d
    move-wide/from16 v14, p17

    :goto_d
    move-wide/from16 p17, v14

    and-int/lit16 v14, v1, 0x4000

    if-eqz v14, :cond_e

    iget-wide v14, v0, LOP4;->o:J

    goto :goto_e

    :cond_e
    move-wide/from16 v14, p19

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-wide/from16 p19, v14

    if-eqz v16, :cond_f

    iget-wide v14, v0, LOP4;->p:J

    goto :goto_f

    :cond_f
    move-wide/from16 v14, p21

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-wide/from16 p21, v14

    if-eqz v16, :cond_10

    iget-object v14, v0, LOP4;->q:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v14, p23

    :goto_10
    const/high16 v15, 0x20000

    and-int/2addr v15, v1

    if-eqz v15, :cond_11

    iget-object v15, v0, LOP4;->r:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p24

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p24, v15

    if-eqz v16, :cond_12

    iget-boolean v15, v0, LOP4;->s:Z

    goto :goto_12

    :cond_12
    move/from16 v15, p25

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p23, v14

    move/from16 p25, v15

    if-eqz v16, :cond_13

    iget-wide v14, v0, LOP4;->t:J

    goto :goto_13

    :cond_13
    move-wide/from16 v14, p26

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-wide/from16 p26, v14

    if-eqz v16, :cond_14

    iget-object v14, v0, LOP4;->u:Lorg/joda/time/DateTime;

    goto :goto_14

    :cond_14
    move-object/from16 v14, p28

    :goto_14
    const/high16 v15, 0x200000

    and-int/2addr v15, v1

    move-object/from16 p28, v14

    if-eqz v15, :cond_15

    iget-wide v14, v0, LOP4;->v:J

    goto :goto_15

    :cond_15
    move-wide/from16 v14, p29

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-wide/from16 p29, v14

    if-eqz v16, :cond_16

    iget-object v14, v0, LOP4;->w:Ljava/util/List;

    goto :goto_16

    :cond_16
    move-object/from16 v14, p31

    :goto_16
    const/high16 v15, 0x800000

    and-int/2addr v15, v1

    if-eqz v15, :cond_17

    iget-object v15, v0, LOP4;->x:Ljava/util/List;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p32

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, v1, v16

    move-object/from16 p32, v15

    if-eqz v16, :cond_18

    iget-object v15, v0, LOP4;->y:Ljava/lang/Boolean;

    goto :goto_18

    :cond_18
    move-object/from16 v15, p33

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, v1, v16

    move-object/from16 p33, v15

    if-eqz v16, :cond_19

    iget-object v15, v0, LOP4;->z:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v15, p34

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, v1, v16

    move-object/from16 p34, v15

    if-eqz v16, :cond_1a

    iget-object v15, v0, LOP4;->A:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v15, p35

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, v1, v16

    move-object/from16 p35, v15

    if-eqz v16, :cond_1b

    iget-object v15, v0, LOP4;->B:Ljava/lang/Boolean;

    goto :goto_1b

    :cond_1b
    move-object/from16 v15, p36

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, v1, v16

    move-object/from16 p36, v15

    if-eqz v16, :cond_1c

    iget-object v15, v0, LOP4;->C:Ljava/lang/Long;

    goto :goto_1c

    :cond_1c
    move-object/from16 v15, p37

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, v1, v16

    move-object/from16 p37, v15

    if-eqz v16, :cond_1d

    iget-object v15, v0, LOP4;->D:Ljava/lang/String;

    goto :goto_1d

    :cond_1d
    move-object/from16 v15, p38

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, v1, v16

    move-object/from16 p38, v15

    if-eqz v16, :cond_1e

    iget-object v15, v0, LOP4;->E:Ljava/lang/Double;

    goto :goto_1e

    :cond_1e
    move-object/from16 v15, p39

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v1, v1, v16

    if-eqz v1, :cond_1f

    iget-object v1, v0, LOP4;->F:Ljava/lang/Double;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p40

    :goto_1f
    and-int/lit8 v16, v2, 0x1

    move-object/from16 p40, v1

    if-eqz v16, :cond_20

    iget-object v1, v0, LOP4;->G:Ljava/lang/Double;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p41

    :goto_20
    and-int/lit8 v16, v2, 0x2

    move-object/from16 p41, v1

    if-eqz v16, :cond_21

    iget-object v1, v0, LOP4;->H:Ljava/lang/Boolean;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p42

    :goto_21
    and-int/lit8 v16, v2, 0x4

    move-object/from16 p42, v1

    if-eqz v16, :cond_22

    iget-object v1, v0, LOP4;->I:Ljava/lang/Double;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p43

    :goto_22
    and-int/lit8 v16, v2, 0x8

    move-object/from16 p43, v1

    if-eqz v16, :cond_23

    iget-object v1, v0, LOP4;->J:Ljava/lang/Double;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p44

    :goto_23
    and-int/lit8 v16, v2, 0x10

    move-object/from16 p44, v1

    if-eqz v16, :cond_24

    iget-object v1, v0, LOP4;->K:Ljava/lang/Double;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p45

    :goto_24
    and-int/lit8 v16, v2, 0x20

    move-object/from16 p45, v1

    if-eqz v16, :cond_25

    iget-object v1, v0, LOP4;->L:Ljava/lang/Boolean;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p46

    :goto_25
    and-int/lit8 v16, v2, 0x40

    move-object/from16 p46, v1

    if-eqz v16, :cond_26

    iget-object v1, v0, LOP4;->M:Ljava/lang/Double;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p47

    :goto_26
    move-object/from16 p47, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, LOP4;->N:Ljava/lang/Double;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p48

    :goto_27
    move-object/from16 p48, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, LOP4;->O:Ljava/lang/Double;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p49

    :goto_28
    move-object/from16 p49, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-object v1, v0, LOP4;->P:Ljava/lang/Boolean;

    goto :goto_29

    :cond_29
    move-object/from16 v1, p50

    :goto_29
    move-object/from16 p50, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, LOP4;->Q:Ljava/lang/Double;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p51

    :goto_2a
    and-int/lit16 v2, v2, 0x800

    if-eqz v2, :cond_2b

    iget-object v2, v0, LOP4;->R:Ljava/lang/Double;

    goto :goto_2b

    :cond_2b
    move-object/from16 v2, p52

    :goto_2b
    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v5

    move-object/from16 p4, v6

    move-object/from16 p5, v7

    move-object/from16 p6, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p9, v11

    move-wide/from16 p10, v12

    move-object/from16 p31, v14

    move-object/from16 p39, v15

    move-object/from16 p51, v1

    move-object/from16 p52, v2

    invoke-virtual/range {p0 .. p52}, LOP4;->a(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)LOP4;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)LOP4;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JD",
            "Lorg/joda/time/DateTime;",
            "JJJJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZJ",
            "Lorg/joda/time/DateTime;",
            "J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ")",
            "LOP4;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-wide/from16 v10, p10

    move-wide/from16 v12, p12

    move-object/from16 v14, p14

    move-wide/from16 v15, p15

    move-wide/from16 v17, p17

    move-wide/from16 v19, p19

    move-wide/from16 v21, p21

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move/from16 v25, p25

    move-wide/from16 v26, p26

    move-object/from16 v28, p28

    move-wide/from16 v29, p29

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move-object/from16 v33, p33

    move-object/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move-object/from16 v37, p37

    move-object/from16 v38, p38

    move-object/from16 v39, p39

    move-object/from16 v40, p40

    move-object/from16 v41, p41

    move-object/from16 v42, p42

    move-object/from16 v43, p43

    move-object/from16 v44, p44

    move-object/from16 v45, p45

    move-object/from16 v46, p46

    move-object/from16 v47, p47

    move-object/from16 v48, p48

    move-object/from16 v49, p49

    move-object/from16 v50, p50

    move-object/from16 v51, p51

    move-object/from16 v52, p52

    const-string v0, "eventId"

    move-object/from16 v53, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventTime"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientTime"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdModel"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    move-object/from16 v1, p9

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    move-object/from16 v1, p14

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideId"

    move-object/from16 v1, p24

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startTime"

    move-object/from16 v1, p28

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v54, LOP4;

    move-object/from16 v0, v54

    move-object/from16 v1, v53

    invoke-direct/range {v0 .. v52}, LOP4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JDLorg/joda/time/DateTime;JJJJLjava/lang/String;Ljava/lang/String;ZJLorg/joda/time/DateTime;JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)V

    return-object v54
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LOP4;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LOP4;

    iget-object v1, p0, LOP4;->a:Ljava/lang/String;

    iget-object v3, p1, LOP4;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LOP4;->b:Lorg/joda/time/DateTime;

    iget-object v3, p1, LOP4;->b:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LOP4;->c:Lorg/joda/time/DateTime;

    iget-object v3, p1, LOP4;->c:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LOP4;->d:Ljava/lang/Boolean;

    iget-object v3, p1, LOP4;->d:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LOP4;->e:Ljava/lang/Boolean;

    iget-object v3, p1, LOP4;->e:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LOP4;->f:Ljava/lang/Boolean;

    iget-object v3, p1, LOP4;->f:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LOP4;->g:Ljava/lang/Boolean;

    iget-object v3, p1, LOP4;->g:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, LOP4;->h:Ljava/lang/String;

    iget-object v3, p1, LOP4;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, LOP4;->i:Ljava/lang/String;

    iget-object v3, p1, LOP4;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, LOP4;->j:J

    iget-wide v5, p1, LOP4;->j:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, LOP4;->k:D

    iget-wide v5, p1, LOP4;->k:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, LOP4;->l:Lorg/joda/time/DateTime;

    iget-object v3, p1, LOP4;->l:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, LOP4;->m:J

    iget-wide v5, p1, LOP4;->m:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, LOP4;->n:J

    iget-wide v5, p1, LOP4;->n:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, LOP4;->o:J

    iget-wide v5, p1, LOP4;->o:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-wide v3, p0, LOP4;->p:J

    iget-wide v5, p1, LOP4;->p:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, LOP4;->q:Ljava/lang/String;

    iget-object v3, p1, LOP4;->q:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, LOP4;->r:Ljava/lang/String;

    iget-object v3, p1, LOP4;->r:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, LOP4;->s:Z

    iget-boolean v3, p1, LOP4;->s:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-wide v3, p0, LOP4;->t:J

    iget-wide v5, p1, LOP4;->t:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, LOP4;->u:Lorg/joda/time/DateTime;

    iget-object v3, p1, LOP4;->u:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-wide v3, p0, LOP4;->v:J

    iget-wide v5, p1, LOP4;->v:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, LOP4;->w:Ljava/util/List;

    iget-object v3, p1, LOP4;->w:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, LOP4;->x:Ljava/util/List;

    iget-object v3, p1, LOP4;->x:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, LOP4;->y:Ljava/lang/Boolean;

    iget-object v3, p1, LOP4;->y:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, LOP4;->z:Ljava/lang/String;

    iget-object v3, p1, LOP4;->z:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, LOP4;->A:Ljava/lang/String;

    iget-object v3, p1, LOP4;->A:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, LOP4;->B:Ljava/lang/Boolean;

    iget-object v3, p1, LOP4;->B:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, LOP4;->C:Ljava/lang/Long;

    iget-object v3, p1, LOP4;->C:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, LOP4;->D:Ljava/lang/String;

    iget-object v3, p1, LOP4;->D:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, LOP4;->E:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->E:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, LOP4;->F:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->F:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, LOP4;->G:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->G:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, LOP4;->H:Ljava/lang/Boolean;

    iget-object v3, p1, LOP4;->H:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, LOP4;->I:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->I:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, LOP4;->J:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->J:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, LOP4;->K:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->K:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, LOP4;->L:Ljava/lang/Boolean;

    iget-object v3, p1, LOP4;->L:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, LOP4;->M:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->M:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, LOP4;->N:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->N:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, LOP4;->O:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->O:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, LOP4;->P:Ljava/lang/Boolean;

    iget-object v3, p1, LOP4;->P:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, LOP4;->Q:Ljava/lang/Double;

    iget-object v3, p1, LOP4;->Q:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, LOP4;->R:Ljava/lang/Double;

    iget-object p1, p1, LOP4;->R:Ljava/lang/Double;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2d

    return v2

    :cond_2d
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "co.bird.data.event.clientanalytics.RideCompleted"

    return-object v0
.end method

.method public getProperties()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x2c

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "event_id"

    iget-object v2, p0, LOP4;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "event_time"

    iget-object v2, p0, LOP4;->b:Lorg/joda/time/DateTime;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "client_time"

    iget-object v2, p0, LOP4;->c:Lorg/joda/time/DateTime;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "is_bluetooth_bird"

    iget-object v2, p0, LOP4;->d:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "bird_is_bluetooth"

    iget-object v2, p0, LOP4;->e:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "is_cellular_bird"

    iget-object v2, p0, LOP4;->f:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "bird_is_cellular"

    iget-object v2, p0, LOP4;->g:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "bird_model"

    iget-object v2, p0, LOP4;->h:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "currency"

    iget-object v2, p0, LOP4;->i:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget-wide v1, p0, LOP4;->j:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "distance_in_meters"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    iget-wide v1, p0, LOP4;->k:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "duration_in_seconds"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "end_time"

    iget-object v2, p0, LOP4;->l:Lorg/joda/time/DateTime;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    iget-wide v1, p0, LOP4;->m:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "receipt_price"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    iget-wide v1, p0, LOP4;->n:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "minimum_ride_price"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    iget-wide v1, p0, LOP4;->o:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "minute_price"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    iget-wide v1, p0, LOP4;->p:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "minutes_included"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "partner_id"

    iget-object v2, p0, LOP4;->q:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "ride_id"

    iget-object v2, p0, LOP4;->r:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x11

    aput-object v1, v0, v2

    iget-boolean v1, p0, LOP4;->s:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "has_sales_tax"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x12

    aput-object v1, v0, v2

    iget-wide v1, p0, LOP4;->t:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "start_price"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "start_time"

    iget-object v2, p0, LOP4;->u:Lorg/joda/time/DateTime;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x14

    aput-object v1, v0, v2

    iget-wide v1, p0, LOP4;->v:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "ride_price"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "area_ids"

    iget-object v2, p0, LOP4;->w:Ljava/util/List;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "time_in_areas"

    iget-object v2, p0, LOP4;->x:Ljava/util/List;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "had_to_park_in_nest"

    iget-object v2, p0, LOP4;->y:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "nearest_nest_id"

    iget-object v2, p0, LOP4;->z:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "nest_status"

    iget-object v2, p0, LOP4;->A:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "is_primary_ride"

    iget-object v2, p0, LOP4;->B:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "concurrent_ride_count"

    iget-object v2, p0, LOP4;->C:Ljava/lang/Long;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "end_ride_attempt_id"

    iget-object v2, p0, LOP4;->D:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const-string v1, "ar_latitude"

    iget-object v2, p0, LOP4;->E:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    const-string v1, "ar_longitude"

    iget-object v2, p0, LOP4;->F:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    const-string v1, "ar_accuracy"

    iget-object v2, p0, LOP4;->G:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x20

    aput-object v1, v0, v2

    const-string v1, "ar_location_mocked"

    iget-object v2, p0, LOP4;->H:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x21

    aput-object v1, v0, v2

    const-string v1, "bird_latitude"

    iget-object v2, p0, LOP4;->I:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x22

    aput-object v1, v0, v2

    const-string v1, "bird_longitude"

    iget-object v2, p0, LOP4;->J:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x23

    aput-object v1, v0, v2

    const-string v1, "bird_accuracy"

    iget-object v2, p0, LOP4;->K:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x24

    aput-object v1, v0, v2

    const-string v1, "bird_location_mocked"

    iget-object v2, p0, LOP4;->L:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x25

    aput-object v1, v0, v2

    const-string v1, "gps_latitude"

    iget-object v2, p0, LOP4;->M:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x26

    aput-object v1, v0, v2

    const-string v1, "gps_longitude"

    iget-object v2, p0, LOP4;->N:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x27

    aput-object v1, v0, v2

    const-string v1, "gps_accuracy"

    iget-object v2, p0, LOP4;->O:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x28

    aput-object v1, v0, v2

    const-string v1, "gps_location_mocked"

    iget-object v2, p0, LOP4;->P:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x29

    aput-object v1, v0, v2

    const-string v1, "accuracy_limit"

    iget-object v2, p0, LOP4;->Q:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    const-string v1, "nest_additional_buffer_meters"

    iget-object v2, p0, LOP4;->R:Ljava/lang/Double;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, LOP4;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->b:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->c:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->d:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->e:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->f:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->g:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->h:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LOP4;->j:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LOP4;->k:D

    invoke-static {v3, v4}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->l:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LOP4;->m:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LOP4;->n:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LOP4;->o:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LOP4;->p:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->q:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->r:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LOP4;->s:Z

    if-eqz v1, :cond_5

    const/4 v1, 0x1

    :cond_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LOP4;->t:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->u:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LOP4;->v:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->w:Ljava/util/List;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->x:Ljava/util/List;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->y:Ljava/lang/Boolean;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->z:Ljava/lang/String;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_8

    :cond_9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->A:Ljava/lang/String;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_9

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->B:Ljava/lang/Boolean;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_a

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->C:Ljava/lang/Long;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_b

    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->D:Ljava/lang/String;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_c

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->E:Ljava/lang/Double;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_d

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->F:Ljava/lang/Double;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_e

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->G:Ljava/lang/Double;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_f

    :cond_10
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->H:Ljava/lang/Boolean;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_10

    :cond_11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->I:Ljava/lang/Double;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_11

    :cond_12
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->J:Ljava/lang/Double;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_12

    :cond_13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->K:Ljava/lang/Double;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_13

    :cond_14
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->L:Ljava/lang/Boolean;

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_14

    :cond_15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->M:Ljava/lang/Double;

    if-nez v1, :cond_16

    move v1, v2

    goto :goto_15

    :cond_16
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->N:Ljava/lang/Double;

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_16

    :cond_17
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->O:Ljava/lang/Double;

    if-nez v1, :cond_18

    move v1, v2

    goto :goto_17

    :cond_18
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->P:Ljava/lang/Boolean;

    if-nez v1, :cond_19

    move v1, v2

    goto :goto_18

    :cond_19
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->Q:Ljava/lang/Double;

    if-nez v1, :cond_1a

    move v1, v2

    goto :goto_19

    :cond_1a
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LOP4;->R:Ljava/lang/Double;

    if-nez v1, :cond_1b

    goto :goto_1a

    :cond_1b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1a
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 54

    move-object/from16 v0, p0

    iget-object v1, v0, LOP4;->a:Ljava/lang/String;

    iget-object v2, v0, LOP4;->b:Lorg/joda/time/DateTime;

    iget-object v3, v0, LOP4;->c:Lorg/joda/time/DateTime;

    iget-object v4, v0, LOP4;->d:Ljava/lang/Boolean;

    iget-object v5, v0, LOP4;->e:Ljava/lang/Boolean;

    iget-object v6, v0, LOP4;->f:Ljava/lang/Boolean;

    iget-object v7, v0, LOP4;->g:Ljava/lang/Boolean;

    iget-object v8, v0, LOP4;->h:Ljava/lang/String;

    iget-object v9, v0, LOP4;->i:Ljava/lang/String;

    iget-wide v10, v0, LOP4;->j:J

    iget-wide v12, v0, LOP4;->k:D

    iget-object v14, v0, LOP4;->l:Lorg/joda/time/DateTime;

    move-object/from16 v16, v14

    iget-wide v14, v0, LOP4;->m:J

    move-wide/from16 v17, v14

    iget-wide v14, v0, LOP4;->n:J

    move-wide/from16 v19, v14

    iget-wide v14, v0, LOP4;->o:J

    move-wide/from16 v21, v14

    iget-wide v14, v0, LOP4;->p:J

    move-wide/from16 v23, v14

    iget-object v14, v0, LOP4;->q:Ljava/lang/String;

    iget-object v15, v0, LOP4;->r:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-boolean v15, v0, LOP4;->s:Z

    move-object/from16 v26, v14

    move/from16 v27, v15

    iget-wide v14, v0, LOP4;->t:J

    move-wide/from16 v28, v14

    iget-object v14, v0, LOP4;->u:Lorg/joda/time/DateTime;

    move-object/from16 v30, v14

    iget-wide v14, v0, LOP4;->v:J

    move-wide/from16 v31, v14

    iget-object v14, v0, LOP4;->w:Ljava/util/List;

    iget-object v15, v0, LOP4;->x:Ljava/util/List;

    move-object/from16 v33, v15

    iget-object v15, v0, LOP4;->y:Ljava/lang/Boolean;

    move-object/from16 v34, v15

    iget-object v15, v0, LOP4;->z:Ljava/lang/String;

    move-object/from16 v35, v15

    iget-object v15, v0, LOP4;->A:Ljava/lang/String;

    move-object/from16 v36, v15

    iget-object v15, v0, LOP4;->B:Ljava/lang/Boolean;

    move-object/from16 v37, v15

    iget-object v15, v0, LOP4;->C:Ljava/lang/Long;

    move-object/from16 v38, v15

    iget-object v15, v0, LOP4;->D:Ljava/lang/String;

    move-object/from16 v39, v15

    iget-object v15, v0, LOP4;->E:Ljava/lang/Double;

    move-object/from16 v40, v15

    iget-object v15, v0, LOP4;->F:Ljava/lang/Double;

    move-object/from16 v41, v15

    iget-object v15, v0, LOP4;->G:Ljava/lang/Double;

    move-object/from16 v42, v15

    iget-object v15, v0, LOP4;->H:Ljava/lang/Boolean;

    move-object/from16 v43, v15

    iget-object v15, v0, LOP4;->I:Ljava/lang/Double;

    move-object/from16 v44, v15

    iget-object v15, v0, LOP4;->J:Ljava/lang/Double;

    move-object/from16 v45, v15

    iget-object v15, v0, LOP4;->K:Ljava/lang/Double;

    move-object/from16 v46, v15

    iget-object v15, v0, LOP4;->L:Ljava/lang/Boolean;

    move-object/from16 v47, v15

    iget-object v15, v0, LOP4;->M:Ljava/lang/Double;

    move-object/from16 v48, v15

    iget-object v15, v0, LOP4;->N:Ljava/lang/Double;

    move-object/from16 v49, v15

    iget-object v15, v0, LOP4;->O:Ljava/lang/Double;

    move-object/from16 v50, v15

    iget-object v15, v0, LOP4;->P:Ljava/lang/Boolean;

    move-object/from16 v51, v15

    iget-object v15, v0, LOP4;->Q:Ljava/lang/Double;

    move-object/from16 v52, v15

    iget-object v15, v0, LOP4;->R:Ljava/lang/Double;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v53, v15

    const-string v15, "RideCompleted(eventId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", eventTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isBluetoothBird="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", birdIsBluetooth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isCellularBird="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", birdIsCellular="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", birdModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", distanceInMeters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", durationInSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receiptPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v17

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", minimumRidePrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v19

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", minutePrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v21

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", minutesIncluded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v23

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", partnerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rideId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hasSalesTax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", startPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v28

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ridePrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v31

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", areaIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeInAreas="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hadToParkInNest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nearestNestId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", nestStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isPrimaryRide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", concurrentRideCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", endRideAttemptId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", arLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", arLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", arAccuracy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", arLocationMocked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", birdLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", birdLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", birdAccuracy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", birdLocationMocked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gpsLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gpsLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v49

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gpsAccuracy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gpsLocationMocked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", accuracyLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v52

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nestAdditionalBufferMeters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v53

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
