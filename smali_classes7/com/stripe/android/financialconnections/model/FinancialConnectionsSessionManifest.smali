.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u00081\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008q\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0081\u0008\u0018\u0000 \u00e9\u00012\u00020\u0001:\u000c\u00ea\u0001\u00eb\u0001\u00e9\u0001\u00ec\u0001\u00ed\u0001\u00ee\u0001B\u00eb\u0003\u0012\u0006\u0010A\u001a\u00020\t\u0012\u0006\u0010B\u001a\u00020\t\u0012\u0006\u0010C\u001a\u00020\t\u0012\u0006\u0010D\u001a\u00020\t\u0012\u0006\u0010E\u001a\u00020\u000e\u0012\u0006\u0010F\u001a\u00020\t\u0012\u0006\u0010G\u001a\u00020\t\u0012\u0006\u0010H\u001a\u00020\t\u0012\u0006\u0010I\u001a\u00020\t\u0012\u0006\u0010J\u001a\u00020\t\u0012\u0006\u0010K\u001a\u00020\u0015\u0012\u0006\u0010L\u001a\u00020\u0017\u0012\u000c\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010N\u001a\u00020\u001c\u0012\u0006\u0010O\u001a\u00020\t\u0012\u0006\u0010P\u001a\u00020\t\u0012\n\u0008\u0002\u0010Q\u001a\u0004\u0018\u00010 \u0012\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010\'\u0012\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0002\u0010X\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010Z\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010\u000e\u0012\u0016\u0008\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u000100\u0012\u0016\u0008\u0002\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100\u0012\n\u0008\u0002\u0010_\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010`\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0002\u0010a\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010b\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010c\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010d\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010e\u001a\u0004\u0018\u000109\u0012\u0016\u0008\u0002\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100\u0012\n\u0008\u0002\u0010g\u001a\u0004\u0018\u00010<\u0012\n\u0008\u0002\u0010h\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010i\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010j\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0006\u0008\u00e2\u0001\u0010\u00e3\u0001B\u00b5\u0004\u0008\u0017\u0012\u0007\u0010\u00e4\u0001\u001a\u00020n\u0012\u0007\u0010\u00e5\u0001\u001a\u00020n\u0012\u0008\u0008\u0001\u0010A\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010B\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010C\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010D\u001a\u00020\t\u0012\n\u0008\u0001\u0010E\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0008\u0001\u0010F\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010G\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010H\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010I\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010J\u001a\u00020\t\u0012\n\u0008\u0001\u0010K\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0001\u0010L\u001a\u0004\u0018\u00010\u0017\u0012\u0010\u0008\u0001\u0010M\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\u0008\u0001\u0010N\u001a\u0004\u0018\u00010\u001c\u0012\u0008\u0008\u0001\u0010O\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010P\u001a\u00020\t\u0012\n\u0008\u0001\u0010Q\u001a\u0004\u0018\u00010 \u0012\n\u0008\u0001\u0010R\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010S\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010T\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010U\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010V\u001a\u0004\u0018\u00010\'\u0012\n\u0008\u0001\u0010W\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0001\u0010X\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010Y\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010Z\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010[\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010\\\u001a\u0004\u0018\u00010\u000e\u0012\u0016\u0008\u0001\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u000100\u0012\u0016\u0008\u0001\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100\u0012\n\u0008\u0001\u0010_\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010`\u001a\u0004\u0018\u00010)\u0012\n\u0008\u0001\u0010a\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010b\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010c\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010d\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010e\u001a\u0004\u0018\u000109\u0012\u0016\u0008\u0001\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100\u0012\n\u0008\u0001\u0010g\u001a\u0004\u0018\u00010<\u0012\n\u0008\u0001\u0010h\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010i\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010j\u001a\u0004\u0018\u00010\t\u0012\n\u0010\u00e7\u0001\u001a\u0005\u0018\u00010\u00e6\u0001\u00a2\u0006\u0006\u0008\u00e2\u0001\u0010\u00e8\u0001J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000c\u001a\u00020\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0015H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0017H\u00c6\u0003J\u000f\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u001cH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\'H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u000100H\u00c6\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010)H\u00c6\u0003J\u0012\u00105\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010$J\u0012\u00107\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010$J\u0012\u00108\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u00088\u0010$J\u000b\u0010:\u001a\u0004\u0018\u000109H\u00c6\u0003J\u0017\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u000100H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010<H\u00c6\u0003J\u0012\u0010>\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010$J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0012\u0010@\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010$J\u0092\u0004\u0010k\u001a\u00020\u00002\u0008\u0008\u0002\u0010A\u001a\u00020\t2\u0008\u0008\u0002\u0010B\u001a\u00020\t2\u0008\u0008\u0002\u0010C\u001a\u00020\t2\u0008\u0008\u0002\u0010D\u001a\u00020\t2\u0008\u0008\u0002\u0010E\u001a\u00020\u000e2\u0008\u0008\u0002\u0010F\u001a\u00020\t2\u0008\u0008\u0002\u0010G\u001a\u00020\t2\u0008\u0008\u0002\u0010H\u001a\u00020\t2\u0008\u0008\u0002\u0010I\u001a\u00020\t2\u0008\u0008\u0002\u0010J\u001a\u00020\t2\u0008\u0008\u0002\u0010K\u001a\u00020\u00152\u0008\u0008\u0002\u0010L\u001a\u00020\u00172\u000e\u0008\u0002\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0008\u0008\u0002\u0010N\u001a\u00020\u001c2\u0008\u0008\u0002\u0010O\u001a\u00020\t2\u0008\u0008\u0002\u0010P\u001a\u00020\t2\n\u0008\u0002\u0010Q\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010\'2\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010X\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010Y\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010Z\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010\u000e2\u0016\u0008\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001002\u0016\u0008\u0002\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u0001002\n\u0008\u0002\u0010_\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010`\u001a\u0004\u0018\u00010)2\n\u0008\u0002\u0010a\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010b\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010c\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010d\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010e\u001a\u0004\u0018\u0001092\u0016\u0008\u0002\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u0001002\n\u0008\u0002\u0010g\u001a\u0004\u0018\u00010<2\n\u0008\u0002\u0010h\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010i\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010j\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008k\u0010lJ\t\u0010m\u001a\u00020\u000eH\u00d6\u0001J\t\u0010o\u001a\u00020nH\u00d6\u0001J\u0013\u0010r\u001a\u00020\t2\u0008\u0010q\u001a\u0004\u0018\u00010pH\u00d6\u0003J\t\u0010s\u001a\u00020nH\u00d6\u0001J\u0019\u0010w\u001a\u00020\u00072\u0006\u0010u\u001a\u00020t2\u0006\u0010v\u001a\u00020nH\u00d6\u0001R \u0010A\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008A\u0010x\u0012\u0004\u0008{\u0010|\u001a\u0004\u0008y\u0010zR \u0010B\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008B\u0010x\u0012\u0004\u0008~\u0010|\u001a\u0004\u0008}\u0010zR!\u0010C\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0013\n\u0004\u0008C\u0010x\u0012\u0005\u0008\u0080\u0001\u0010|\u001a\u0004\u0008\u007f\u0010zR\"\u0010D\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008D\u0010x\u0012\u0005\u0008\u0082\u0001\u0010|\u001a\u0005\u0008\u0081\u0001\u0010zR$\u0010E\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008E\u0010\u0083\u0001\u0012\u0005\u0008\u0086\u0001\u0010|\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001R\"\u0010F\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008F\u0010x\u0012\u0005\u0008\u0088\u0001\u0010|\u001a\u0005\u0008\u0087\u0001\u0010zR\"\u0010G\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008G\u0010x\u0012\u0005\u0008\u008a\u0001\u0010|\u001a\u0005\u0008\u0089\u0001\u0010zR\"\u0010H\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008H\u0010x\u0012\u0005\u0008\u008c\u0001\u0010|\u001a\u0005\u0008\u008b\u0001\u0010zR\"\u0010I\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008I\u0010x\u0012\u0005\u0008\u008e\u0001\u0010|\u001a\u0005\u0008\u008d\u0001\u0010zR\"\u0010J\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008J\u0010x\u0012\u0005\u0008\u0090\u0001\u0010|\u001a\u0005\u0008\u008f\u0001\u0010zR$\u0010K\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008K\u0010\u0091\u0001\u0012\u0005\u0008\u0094\u0001\u0010|\u001a\u0006\u0008\u0092\u0001\u0010\u0093\u0001R$\u0010L\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008L\u0010\u0095\u0001\u0012\u0005\u0008\u0098\u0001\u0010|\u001a\u0006\u0008\u0096\u0001\u0010\u0097\u0001R*\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008M\u0010\u0099\u0001\u0012\u0005\u0008\u009c\u0001\u0010|\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001R$\u0010N\u001a\u00020\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008N\u0010\u009d\u0001\u0012\u0005\u0008\u00a0\u0001\u0010|\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001R\"\u0010O\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008O\u0010x\u0012\u0005\u0008\u00a2\u0001\u0010|\u001a\u0005\u0008\u00a1\u0001\u0010zR\"\u0010P\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008P\u0010x\u0012\u0005\u0008\u00a4\u0001\u0010|\u001a\u0005\u0008\u00a3\u0001\u0010zR&\u0010Q\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008Q\u0010\u00a5\u0001\u0012\u0005\u0008\u00a8\u0001\u0010|\u001a\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R&\u0010R\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008R\u0010\u0083\u0001\u0012\u0005\u0008\u00aa\u0001\u0010|\u001a\u0006\u0008\u00a9\u0001\u0010\u0085\u0001R%\u0010S\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008S\u0010\u00ab\u0001\u0012\u0005\u0008\u00ad\u0001\u0010|\u001a\u0005\u0008\u00ac\u0001\u0010$R&\u0010T\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008T\u0010\u0083\u0001\u0012\u0005\u0008\u00af\u0001\u0010|\u001a\u0006\u0008\u00ae\u0001\u0010\u0085\u0001R&\u0010U\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008U\u0010\u0083\u0001\u0012\u0005\u0008\u00b1\u0001\u0010|\u001a\u0006\u0008\u00b0\u0001\u0010\u0085\u0001R&\u0010V\u001a\u0004\u0018\u00010\'8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008V\u0010\u00b2\u0001\u0012\u0005\u0008\u00b5\u0001\u0010|\u001a\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001R&\u0010W\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008W\u0010\u00b6\u0001\u0012\u0005\u0008\u00b9\u0001\u0010|\u001a\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001R&\u0010X\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008X\u0010\u0083\u0001\u0012\u0005\u0008\u00bb\u0001\u0010|\u001a\u0006\u0008\u00ba\u0001\u0010\u0085\u0001R&\u0010Y\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008Y\u0010\u0083\u0001\u0012\u0005\u0008\u00bd\u0001\u0010|\u001a\u0006\u0008\u00bc\u0001\u0010\u0085\u0001R&\u0010Z\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008Z\u0010\u0083\u0001\u0012\u0005\u0008\u00bf\u0001\u0010|\u001a\u0006\u0008\u00be\u0001\u0010\u0085\u0001R&\u0010[\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008[\u0010\u0083\u0001\u0012\u0005\u0008\u00c1\u0001\u0010|\u001a\u0006\u0008\u00c0\u0001\u0010\u0085\u0001R&\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008\\\u0010\u0083\u0001\u0012\u0005\u0008\u00c3\u0001\u0010|\u001a\u0006\u0008\u00c2\u0001\u0010\u0085\u0001R2\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u0001008\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008]\u0010\u00c4\u0001\u0012\u0005\u0008\u00c7\u0001\u0010|\u001a\u0006\u0008\u00c5\u0001\u0010\u00c6\u0001R2\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u0001008\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008^\u0010\u00c4\u0001\u0012\u0005\u0008\u00c9\u0001\u0010|\u001a\u0006\u0008\u00c8\u0001\u0010\u00c6\u0001R&\u0010_\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008_\u0010\u0083\u0001\u0012\u0005\u0008\u00cb\u0001\u0010|\u001a\u0006\u0008\u00ca\u0001\u0010\u0085\u0001R&\u0010`\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008`\u0010\u00b6\u0001\u0012\u0005\u0008\u00cd\u0001\u0010|\u001a\u0006\u0008\u00cc\u0001\u0010\u00b8\u0001R$\u0010a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0005\u0008a\u0010\u00ab\u0001\u0012\u0005\u0008\u00ce\u0001\u0010|\u001a\u0004\u0008a\u0010$R$\u0010b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0005\u0008b\u0010\u00ab\u0001\u0012\u0005\u0008\u00cf\u0001\u0010|\u001a\u0004\u0008b\u0010$R$\u0010c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0005\u0008c\u0010\u00ab\u0001\u0012\u0005\u0008\u00d0\u0001\u0010|\u001a\u0004\u0008c\u0010$R$\u0010d\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0005\u0008d\u0010\u00ab\u0001\u0012\u0005\u0008\u00d1\u0001\u0010|\u001a\u0004\u0008d\u0010$R&\u0010e\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008e\u0010\u00d2\u0001\u0012\u0005\u0008\u00d5\u0001\u0010|\u001a\u0006\u0008\u00d3\u0001\u0010\u00d4\u0001R2\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u0001008\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008f\u0010\u00c4\u0001\u0012\u0005\u0008\u00d7\u0001\u0010|\u001a\u0006\u0008\u00d6\u0001\u0010\u00c6\u0001R&\u0010g\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008g\u0010\u00d8\u0001\u0012\u0005\u0008\u00db\u0001\u0010|\u001a\u0006\u0008\u00d9\u0001\u0010\u00da\u0001R%\u0010h\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008h\u0010\u00ab\u0001\u0012\u0005\u0008\u00dd\u0001\u0010|\u001a\u0005\u0008\u00dc\u0001\u0010$R&\u0010i\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0016\n\u0005\u0008i\u0010\u0083\u0001\u0012\u0005\u0008\u00df\u0001\u0010|\u001a\u0006\u0008\u00de\u0001\u0010\u0085\u0001R%\u0010j\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008j\u0010\u00ab\u0001\u0012\u0005\u0008\u00e1\u0001\u0010|\u001a\u0005\u0008\u00e0\u0001\u0010$\u00a8\u0006\u00ef\u0001"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "component11",
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        "component12",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
        "component13",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;",
        "component14",
        "component15",
        "component16",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;",
        "component17",
        "component18",
        "component19",
        "()Ljava/lang/Boolean;",
        "component20",
        "component21",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "component22",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "",
        "component29",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;",
        "component37",
        "component38",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
        "component39",
        "component40",
        "component41",
        "component42",
        "allowManualEntry",
        "consentRequired",
        "customManualEntryHandling",
        "disableLinkMoreAccounts",
        "id",
        "instantVerificationDisabled",
        "institutionSearchDisabled",
        "livemode",
        "manualEntryUsesMicrodeposits",
        "mobileHandoffEnabled",
        "nextPane",
        "manualEntryMode",
        "permissions",
        "product",
        "singleAccount",
        "useSingleSortSearch",
        "accountDisconnectionMethod",
        "accountholderCustomerEmailAddress",
        "accountholderIsLinkConsumer",
        "accountholderPhoneNumber",
        "accountholderToken",
        "activeAuthSession",
        "activeInstitution",
        "assignmentEventId",
        "businessName",
        "cancelUrl",
        "connectPlatformName",
        "connectedAccountName",
        "experimentAssignments",
        "features",
        "hostedAuthUrl",
        "initialInstitution",
        "isEndUserFacing",
        "isLinkWithStripe",
        "isNetworkingUserFlow",
        "isStripeDirect",
        "linkAccountSessionCancellationBehavior",
        "modalCustomization",
        "paymentMethodType",
        "stepUpAuthenticationRequired",
        "successUrl",
        "skipSuccessPane",
        "copy",
        "(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Z",
        "getAllowManualEntry",
        "()Z",
        "getAllowManualEntry$annotations",
        "()V",
        "getConsentRequired",
        "getConsentRequired$annotations",
        "getCustomManualEntryHandling",
        "getCustomManualEntryHandling$annotations",
        "getDisableLinkMoreAccounts",
        "getDisableLinkMoreAccounts$annotations",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "getId$annotations",
        "getInstantVerificationDisabled",
        "getInstantVerificationDisabled$annotations",
        "getInstitutionSearchDisabled",
        "getInstitutionSearchDisabled$annotations",
        "getLivemode",
        "getLivemode$annotations",
        "getManualEntryUsesMicrodeposits",
        "getManualEntryUsesMicrodeposits$annotations",
        "getMobileHandoffEnabled",
        "getMobileHandoffEnabled$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getNextPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getNextPane$annotations",
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        "getManualEntryMode",
        "()Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        "getManualEntryMode$annotations",
        "Ljava/util/List;",
        "getPermissions",
        "()Ljava/util/List;",
        "getPermissions$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;",
        "getProduct",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;",
        "getProduct$annotations",
        "getSingleAccount",
        "getSingleAccount$annotations",
        "getUseSingleSortSearch",
        "getUseSingleSortSearch$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;",
        "getAccountDisconnectionMethod",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;",
        "getAccountDisconnectionMethod$annotations",
        "getAccountholderCustomerEmailAddress",
        "getAccountholderCustomerEmailAddress$annotations",
        "Ljava/lang/Boolean;",
        "getAccountholderIsLinkConsumer",
        "getAccountholderIsLinkConsumer$annotations",
        "getAccountholderPhoneNumber",
        "getAccountholderPhoneNumber$annotations",
        "getAccountholderToken",
        "getAccountholderToken$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "getActiveAuthSession",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "getActiveAuthSession$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "getActiveInstitution",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "getActiveInstitution$annotations",
        "getAssignmentEventId",
        "getAssignmentEventId$annotations",
        "getBusinessName",
        "getBusinessName$annotations",
        "getCancelUrl",
        "getCancelUrl$annotations",
        "getConnectPlatformName",
        "getConnectPlatformName$annotations",
        "getConnectedAccountName",
        "getConnectedAccountName$annotations",
        "Ljava/util/Map;",
        "getExperimentAssignments",
        "()Ljava/util/Map;",
        "getExperimentAssignments$annotations",
        "getFeatures",
        "getFeatures$annotations",
        "getHostedAuthUrl",
        "getHostedAuthUrl$annotations",
        "getInitialInstitution",
        "getInitialInstitution$annotations",
        "isEndUserFacing$annotations",
        "isLinkWithStripe$annotations",
        "isNetworkingUserFlow$annotations",
        "isStripeDirect$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;",
        "getLinkAccountSessionCancellationBehavior",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;",
        "getLinkAccountSessionCancellationBehavior$annotations",
        "getModalCustomization",
        "getModalCustomization$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
        "getPaymentMethodType",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
        "getPaymentMethodType$annotations",
        "getStepUpAuthenticationRequired",
        "getStepUpAuthenticationRequired$annotations",
        "getSuccessUrl",
        "getSuccessUrl$annotations",
        "getSkipSuccessPane",
        "getSkipSuccessPane$annotations",
        "<init>",
        "(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V",
        "seen1",
        "seen2",
        "Lbt5;",
        "serializationConstructorMarker",
        "(IIZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lbt5;)V",
        "Companion",
        "$serializer",
        "AccountDisconnectionMethod",
        "LinkAccountSessionCancellationBehavior",
        "Pane",
        "Product",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;


# instance fields
.field private final accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

.field private final accountholderCustomerEmailAddress:Ljava/lang/String;

.field private final accountholderIsLinkConsumer:Ljava/lang/Boolean;

.field private final accountholderPhoneNumber:Ljava/lang/String;

.field private final accountholderToken:Ljava/lang/String;

.field private final activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

.field private final activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final allowManualEntry:Z

.field private final assignmentEventId:Ljava/lang/String;

.field private final businessName:Ljava/lang/String;

.field private final cancelUrl:Ljava/lang/String;

.field private final connectPlatformName:Ljava/lang/String;

.field private final connectedAccountName:Ljava/lang/String;

.field private final consentRequired:Z

.field private final customManualEntryHandling:Z

.field private final disableLinkMoreAccounts:Z

.field private final experimentAssignments:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final features:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final hostedAuthUrl:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field private final instantVerificationDisabled:Z

.field private final institutionSearchDisabled:Z

.field private final isEndUserFacing:Ljava/lang/Boolean;

.field private final isLinkWithStripe:Ljava/lang/Boolean;

.field private final isNetworkingUserFlow:Ljava/lang/Boolean;

.field private final isStripeDirect:Ljava/lang/Boolean;

.field private final linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

.field private final livemode:Z

.field private final manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

.field private final manualEntryUsesMicrodeposits:Z

.field private final mobileHandoffEnabled:Z

.field private final modalCustomization:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

.field private final paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

.field private final permissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation
.end field

.field private final product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

.field private final singleAccount:Z

.field private final skipSuccessPane:Ljava/lang/Boolean;

.field private final stepUpAuthenticationRequired:Ljava/lang/Boolean;

.field private final successUrl:Ljava/lang/String;

.field private final useSingleSortSearch:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(IIZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lbt5;)V
    .locals 6
    .param p3    # Z
        .annotation runtime LVs5;
            value = "allow_manual_entry"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime LVs5;
            value = "consent_required"
        .end annotation
    .end param
    .param p5    # Z
        .annotation runtime LVs5;
            value = "custom_manual_entry_handling"
        .end annotation
    .end param
    .param p6    # Z
        .annotation runtime LVs5;
            value = "disable_link_more_accounts"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "id"
        .end annotation
    .end param
    .param p8    # Z
        .annotation runtime LVs5;
            value = "instant_verification_disabled"
        .end annotation
    .end param
    .param p9    # Z
        .annotation runtime LVs5;
            value = "institution_search_disabled"
        .end annotation
    .end param
    .param p10    # Z
        .annotation runtime LVs5;
            value = "livemode"
        .end annotation
    .end param
    .param p11    # Z
        .annotation runtime LVs5;
            value = "manual_entry_uses_microdeposits"
        .end annotation
    .end param
    .param p12    # Z
        .annotation runtime LVs5;
            value = "mobile_handoff_enabled"
        .end annotation
    .end param
    .param p13    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
        .annotation runtime LVs5;
            value = "next_pane"
        .end annotation
    .end param
    .param p14    # Lcom/stripe/android/financialconnections/model/ManualEntryMode;
        .annotation runtime LVs5;
            value = "manual_entry_mode"
        .end annotation
    .end param
    .param p15    # Ljava/util/List;
        .annotation runtime LVs5;
            value = "permissions"
        .end annotation
    .end param
    .param p16    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;
        .annotation runtime LVs5;
            value = "product"
        .end annotation
    .end param
    .param p17    # Z
        .annotation runtime LVs5;
            value = "single_account"
        .end annotation
    .end param
    .param p18    # Z
        .annotation runtime LVs5;
            value = "use_single_sort_search"
        .end annotation
    .end param
    .param p19    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;
        .annotation runtime LVs5;
            value = "account_disconnection_method"
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "accountholder_customer_email_address"
        .end annotation
    .end param
    .param p21    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "accountholder_is_link_consumer"
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "accountholder_phone_number"
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "accountholder_token"
        .end annotation
    .end param
    .param p24    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
        .annotation runtime LVs5;
            value = "active_auth_session"
        .end annotation
    .end param
    .param p25    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
        .annotation runtime LVs5;
            value = "active_institution"
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "assignment_event_id"
        .end annotation
    .end param
    .param p27    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "business_name"
        .end annotation
    .end param
    .param p28    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "cancel_url"
        .end annotation
    .end param
    .param p29    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "connect_platform_name"
        .end annotation
    .end param
    .param p30    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "connected_account_name"
        .end annotation
    .end param
    .param p31    # Ljava/util/Map;
        .annotation runtime LVs5;
            value = "experiment_assignments"
        .end annotation
    .end param
    .param p32    # Ljava/util/Map;
        .annotation runtime LVs5;
            value = "features"
        .end annotation
    .end param
    .param p33    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "hosted_auth_url"
        .end annotation
    .end param
    .param p34    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
        .annotation runtime LVs5;
            value = "initial_institution"
        .end annotation
    .end param
    .param p35    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "is_end_user_facing"
        .end annotation
    .end param
    .param p36    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "is_link_with_stripe"
        .end annotation
    .end param
    .param p37    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "is_networking_user_flow"
        .end annotation
    .end param
    .param p38    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "is_stripe_direct"
        .end annotation
    .end param
    .param p39    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;
        .annotation runtime LVs5;
            value = "link_account_session_cancellation_behavior"
        .end annotation
    .end param
    .param p40    # Ljava/util/Map;
        .annotation runtime LVs5;
            value = "modal_customization"
        .end annotation
    .end param
    .param p41    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;
        .annotation runtime LVs5;
            value = "payment_method_type"
        .end annotation
    .end param
    .param p42    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "step_up_authentication_required"
        .end annotation
    .end param
    .param p43    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "success_url"
        .end annotation
    .end param
    .param p44    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "skip_success_pane"
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "This synthesized declaration should not be used directly"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    move-object v0, p0

    move v1, p2

    const v2, 0xffff

    and-int v3, p1, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    and-int/lit8 v3, v1, 0x0

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    or-int/2addr v2, v3

    if-eqz v2, :cond_2

    const/4 v2, 0x2

    new-array v3, v2, [I

    aput p1, v3, v5

    aput v1, v3, v4

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$$serializer;->getDescriptor()LMs5;

    move-result-object v4

    invoke-static {v3, v2, v4}, LzW3;->a([I[ILMs5;)V

    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v2, p3

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    move v2, p4

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    move v2, p5

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    move v2, p6

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    move-object v2, p7

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    move v2, p8

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    move v2, p9

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    move/from16 v2, p10

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    move/from16 v2, p11

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    move/from16 v2, p12

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    move-object/from16 v2, p13

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-object/from16 v2, p14

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    move-object/from16 v2, p15

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    move-object/from16 v2, p16

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    move/from16 v2, p17

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    move/from16 v2, p18

    iput-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    const/high16 v2, 0x10000

    and-int/2addr v2, p1

    const/4 v3, 0x0

    if-nez v2, :cond_3

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    goto :goto_2

    :cond_3
    move-object/from16 v2, p19

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    :goto_2
    const/high16 v2, 0x20000

    and-int/2addr v2, p1

    if-nez v2, :cond_4

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v2, p20

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    :goto_3
    const/high16 v2, 0x40000

    and-int/2addr v2, p1

    if-nez v2, :cond_5

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    goto :goto_4

    :cond_5
    move-object/from16 v2, p21

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    :goto_4
    const/high16 v2, 0x80000

    and-int/2addr v2, p1

    if-nez v2, :cond_6

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v2, p22

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    :goto_5
    const/high16 v2, 0x100000

    and-int/2addr v2, p1

    if-nez v2, :cond_7

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v2, p23

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    :goto_6
    const/high16 v2, 0x200000

    and-int/2addr v2, p1

    if-nez v2, :cond_8

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    goto :goto_7

    :cond_8
    move-object/from16 v2, p24

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    :goto_7
    const/high16 v2, 0x400000

    and-int/2addr v2, p1

    if-nez v2, :cond_9

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    goto :goto_8

    :cond_9
    move-object/from16 v2, p25

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    :goto_8
    const/high16 v2, 0x800000

    and-int/2addr v2, p1

    if-nez v2, :cond_a

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    goto :goto_9

    :cond_a
    move-object/from16 v2, p26

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    :goto_9
    const/high16 v2, 0x1000000

    and-int/2addr v2, p1

    if-nez v2, :cond_b

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    goto :goto_a

    :cond_b
    move-object/from16 v2, p27

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    :goto_a
    const/high16 v2, 0x2000000

    and-int/2addr v2, p1

    if-nez v2, :cond_c

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    goto :goto_b

    :cond_c
    move-object/from16 v2, p28

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    :goto_b
    const/high16 v2, 0x4000000

    and-int/2addr v2, p1

    if-nez v2, :cond_d

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    goto :goto_c

    :cond_d
    move-object/from16 v2, p29

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    :goto_c
    const/high16 v2, 0x8000000

    and-int/2addr v2, p1

    if-nez v2, :cond_e

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    goto :goto_d

    :cond_e
    move-object/from16 v2, p30

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    :goto_d
    const/high16 v2, 0x10000000

    and-int/2addr v2, p1

    if-nez v2, :cond_f

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    goto :goto_e

    :cond_f
    move-object/from16 v2, p31

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    :goto_e
    const/high16 v2, 0x20000000

    and-int/2addr v2, p1

    if-nez v2, :cond_10

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    goto :goto_f

    :cond_10
    move-object/from16 v2, p32

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    :goto_f
    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v2, p1

    if-nez v2, :cond_11

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    goto :goto_10

    :cond_11
    move-object/from16 v2, p33

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    :goto_10
    const/high16 v2, -0x80000000

    and-int/2addr v2, p1

    if-nez v2, :cond_12

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    goto :goto_11

    :cond_12
    move-object/from16 v2, p34

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    :goto_11
    and-int/lit8 v2, v1, 0x1

    if-nez v2, :cond_13

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    goto :goto_12

    :cond_13
    move-object/from16 v2, p35

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    :goto_12
    and-int/lit8 v2, v1, 0x2

    if-nez v2, :cond_14

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    goto :goto_13

    :cond_14
    move-object/from16 v2, p36

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    :goto_13
    and-int/lit8 v2, v1, 0x4

    if-nez v2, :cond_15

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    goto :goto_14

    :cond_15
    move-object/from16 v2, p37

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    :goto_14
    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_16

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    goto :goto_15

    :cond_16
    move-object/from16 v2, p38

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    :goto_15
    and-int/lit8 v2, v1, 0x10

    if-nez v2, :cond_17

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    goto :goto_16

    :cond_17
    move-object/from16 v2, p39

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    :goto_16
    and-int/lit8 v2, v1, 0x20

    if-nez v2, :cond_18

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    goto :goto_17

    :cond_18
    move-object/from16 v2, p40

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    :goto_17
    and-int/lit8 v2, v1, 0x40

    if-nez v2, :cond_19

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    goto :goto_18

    :cond_19
    move-object/from16 v2, p41

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    :goto_18
    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_1a

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    goto :goto_19

    :cond_1a
    move-object/from16 v2, p42

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    :goto_19
    and-int/lit16 v2, v1, 0x100

    if-nez v2, :cond_1b

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    goto :goto_1a

    :cond_1b
    move-object/from16 v2, p43

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    :goto_1a
    and-int/lit16 v1, v1, 0x200

    if-nez v1, :cond_1c

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    goto :goto_1b

    :cond_1c
    move-object/from16 v1, p44

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    :goto_1b
    return-void

    nop

    :array_0
    .array-data 4
        0xffff
        0x0
    .end array-data
.end method

.method public constructor <init>(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZ",
            "Ljava/lang/String;",
            "ZZZZZ",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;",
            "ZZ",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p5

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object/from16 v4, p13

    move-object/from16 v5, p14

    const-string v6, "id"

    invoke-static {p5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "nextPane"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "manualEntryMode"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "permissions"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "product"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v6, p1

    iput-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    move v6, p2

    iput-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    move v6, p3

    iput-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    move v6, p4

    iput-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    move v1, p6

    iput-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    move v1, p7

    iput-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    move v1, p8

    iput-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    move/from16 v1, p9

    iput-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    move/from16 v1, p10

    iput-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    iput-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iput-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    iput-object v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    move/from16 v1, p15

    iput-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    move-object/from16 v1, p21

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    move-object/from16 v1, p22

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-object/from16 v1, p23

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object/from16 v1, p24

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    move-object/from16 v1, p25

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    move-object/from16 v1, p26

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    move-object/from16 v1, p27

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    move-object/from16 v1, p28

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    move-object/from16 v1, p29

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    move-object/from16 v1, p30

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    move-object/from16 v1, p31

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    move-object/from16 v1, p32

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object/from16 v1, p33

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    move-object/from16 v1, p34

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    move-object/from16 v1, p35

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    move-object/from16 v1, p36

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    move-object/from16 v1, p37

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    move-object/from16 v1, p38

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    move-object/from16 v1, p39

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    move-object/from16 v1, p40

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    move-object/from16 v1, p41

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    move-object/from16 v1, p42

    iput-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 46

    move/from16 v0, p44

    const/high16 v1, 0x10000

    and-int v1, p43, v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object/from16 v20, v2

    goto :goto_0

    :cond_0
    move-object/from16 v20, p17

    :goto_0
    const/high16 v1, 0x20000

    and-int v1, p43, v1

    if-eqz v1, :cond_1

    move-object/from16 v21, v2

    goto :goto_1

    :cond_1
    move-object/from16 v21, p18

    :goto_1
    const/high16 v1, 0x40000

    and-int v1, p43, v1

    if-eqz v1, :cond_2

    move-object/from16 v22, v2

    goto :goto_2

    :cond_2
    move-object/from16 v22, p19

    :goto_2
    const/high16 v1, 0x80000

    and-int v1, p43, v1

    if-eqz v1, :cond_3

    move-object/from16 v23, v2

    goto :goto_3

    :cond_3
    move-object/from16 v23, p20

    :goto_3
    const/high16 v1, 0x100000

    and-int v1, p43, v1

    if-eqz v1, :cond_4

    move-object/from16 v24, v2

    goto :goto_4

    :cond_4
    move-object/from16 v24, p21

    :goto_4
    const/high16 v1, 0x200000

    and-int v1, p43, v1

    if-eqz v1, :cond_5

    move-object/from16 v25, v2

    goto :goto_5

    :cond_5
    move-object/from16 v25, p22

    :goto_5
    const/high16 v1, 0x400000

    and-int v1, p43, v1

    if-eqz v1, :cond_6

    move-object/from16 v26, v2

    goto :goto_6

    :cond_6
    move-object/from16 v26, p23

    :goto_6
    const/high16 v1, 0x800000

    and-int v1, p43, v1

    if-eqz v1, :cond_7

    move-object/from16 v27, v2

    goto :goto_7

    :cond_7
    move-object/from16 v27, p24

    :goto_7
    const/high16 v1, 0x1000000

    and-int v1, p43, v1

    if-eqz v1, :cond_8

    move-object/from16 v28, v2

    goto :goto_8

    :cond_8
    move-object/from16 v28, p25

    :goto_8
    const/high16 v1, 0x2000000

    and-int v1, p43, v1

    if-eqz v1, :cond_9

    move-object/from16 v29, v2

    goto :goto_9

    :cond_9
    move-object/from16 v29, p26

    :goto_9
    const/high16 v1, 0x4000000

    and-int v1, p43, v1

    if-eqz v1, :cond_a

    move-object/from16 v30, v2

    goto :goto_a

    :cond_a
    move-object/from16 v30, p27

    :goto_a
    const/high16 v1, 0x8000000

    and-int v1, p43, v1

    if-eqz v1, :cond_b

    move-object/from16 v31, v2

    goto :goto_b

    :cond_b
    move-object/from16 v31, p28

    :goto_b
    const/high16 v1, 0x10000000

    and-int v1, p43, v1

    if-eqz v1, :cond_c

    move-object/from16 v32, v2

    goto :goto_c

    :cond_c
    move-object/from16 v32, p29

    :goto_c
    const/high16 v1, 0x20000000

    and-int v1, p43, v1

    if-eqz v1, :cond_d

    move-object/from16 v33, v2

    goto :goto_d

    :cond_d
    move-object/from16 v33, p30

    :goto_d
    const/high16 v1, 0x40000000    # 2.0f

    and-int v1, p43, v1

    if-eqz v1, :cond_e

    move-object/from16 v34, v2

    goto :goto_e

    :cond_e
    move-object/from16 v34, p31

    :goto_e
    const/high16 v1, -0x80000000

    and-int v1, p43, v1

    if-eqz v1, :cond_f

    move-object/from16 v35, v2

    goto :goto_f

    :cond_f
    move-object/from16 v35, p32

    :goto_f
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_10

    move-object/from16 v36, v2

    goto :goto_10

    :cond_10
    move-object/from16 v36, p33

    :goto_10
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_11

    move-object/from16 v37, v2

    goto :goto_11

    :cond_11
    move-object/from16 v37, p34

    :goto_11
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_12

    move-object/from16 v38, v2

    goto :goto_12

    :cond_12
    move-object/from16 v38, p35

    :goto_12
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_13

    move-object/from16 v39, v2

    goto :goto_13

    :cond_13
    move-object/from16 v39, p36

    :goto_13
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_14

    move-object/from16 v40, v2

    goto :goto_14

    :cond_14
    move-object/from16 v40, p37

    :goto_14
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_15

    move-object/from16 v41, v2

    goto :goto_15

    :cond_15
    move-object/from16 v41, p38

    :goto_15
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_16

    move-object/from16 v42, v2

    goto :goto_16

    :cond_16
    move-object/from16 v42, p39

    :goto_16
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_17

    move-object/from16 v43, v2

    goto :goto_17

    :cond_17
    move-object/from16 v43, p40

    :goto_17
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_18

    move-object/from16 v44, v2

    goto :goto_18

    :cond_18
    move-object/from16 v44, p41

    :goto_18
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_19

    move-object/from16 v45, v2

    goto :goto_19

    :cond_19
    move-object/from16 v45, p42

    :goto_19
    move-object/from16 v3, p0

    move/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p3

    move/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    move/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    move-object/from16 v17, p14

    move/from16 v18, p15

    move/from16 v19, p16

    invoke-direct/range {v3 .. v45}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;-><init>(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;IILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p43

    move/from16 v2, p44

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-boolean v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    goto :goto_0

    :cond_0
    move/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-boolean v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-boolean v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    goto :goto_2

    :cond_2
    move/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-boolean v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-boolean v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    goto :goto_6

    :cond_6
    move/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-boolean v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-boolean v11, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move-object/from16 p13, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-boolean v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    goto :goto_e

    :cond_e
    move/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move/from16 p15, v15

    if-eqz v16, :cond_f

    iget-boolean v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    goto :goto_f

    :cond_f
    move/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p20, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-object/from16 p21, v15

    if-eqz v16, :cond_15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-object/from16 p22, v15

    if-eqz v16, :cond_16

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, v1, v16

    move-object/from16 p23, v15

    if-eqz v16, :cond_17

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, v1, v16

    move-object/from16 p24, v15

    if-eqz v16, :cond_18

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v15, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, v1, v16

    move-object/from16 p25, v15

    if-eqz v16, :cond_19

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v15, p26

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, v1, v16

    move-object/from16 p26, v15

    if-eqz v16, :cond_1a

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    goto :goto_1a

    :cond_1a
    move-object/from16 v15, p27

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, v1, v16

    move-object/from16 p27, v15

    if-eqz v16, :cond_1b

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v15, p28

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, v1, v16

    move-object/from16 p28, v15

    if-eqz v16, :cond_1c

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    goto :goto_1c

    :cond_1c
    move-object/from16 v15, p29

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, v1, v16

    move-object/from16 p29, v15

    if-eqz v16, :cond_1d

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    goto :goto_1d

    :cond_1d
    move-object/from16 v15, p30

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, v1, v16

    move-object/from16 p30, v15

    if-eqz v16, :cond_1e

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    goto :goto_1e

    :cond_1e
    move-object/from16 v15, p31

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v1, v1, v16

    if-eqz v1, :cond_1f

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v16, v2, 0x1

    move-object/from16 p32, v1

    if-eqz v16, :cond_20

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p33

    :goto_20
    and-int/lit8 v16, v2, 0x2

    move-object/from16 p33, v1

    if-eqz v16, :cond_21

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p34

    :goto_21
    and-int/lit8 v16, v2, 0x4

    move-object/from16 p34, v1

    if-eqz v16, :cond_22

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v16, v2, 0x8

    move-object/from16 p35, v1

    if-eqz v16, :cond_23

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v16, v2, 0x10

    move-object/from16 p36, v1

    if-eqz v16, :cond_24

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v16, v2, 0x20

    move-object/from16 p37, v1

    if-eqz v16, :cond_25

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v16, v2, 0x40

    move-object/from16 p38, v1

    if-eqz v16, :cond_26

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p39, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p40, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    and-int/lit16 v2, v2, 0x200

    if-eqz v2, :cond_29

    iget-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    goto :goto_29

    :cond_29
    move-object/from16 v2, p42

    :goto_29
    move/from16 p1, v3

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move-object/from16 p5, v7

    move/from16 p6, v8

    move/from16 p7, v9

    move/from16 p8, v10

    move/from16 p9, v11

    move/from16 p10, v12

    move-object/from16 p11, v13

    move-object/from16 p12, v14

    move-object/from16 p31, v15

    move-object/from16 p41, v1

    move-object/from16 p42, v2

    invoke-virtual/range {p0 .. p42}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->copy(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAccountDisconnectionMethod$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "account_disconnection_method"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountholderCustomerEmailAddress$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "accountholder_customer_email_address"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountholderIsLinkConsumer$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "accountholder_is_link_consumer"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountholderPhoneNumber$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "accountholder_phone_number"
    .end annotation

    return-void
.end method

.method public static synthetic getAccountholderToken$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "accountholder_token"
    .end annotation

    return-void
.end method

.method public static synthetic getActiveAuthSession$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "active_auth_session"
    .end annotation

    return-void
.end method

.method public static synthetic getActiveInstitution$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "active_institution"
    .end annotation

    return-void
.end method

.method public static synthetic getAllowManualEntry$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "allow_manual_entry"
    .end annotation

    return-void
.end method

.method public static synthetic getAssignmentEventId$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "assignment_event_id"
    .end annotation

    return-void
.end method

.method public static synthetic getBusinessName$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "business_name"
    .end annotation

    return-void
.end method

.method public static synthetic getCancelUrl$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "cancel_url"
    .end annotation

    return-void
.end method

.method public static synthetic getConnectPlatformName$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "connect_platform_name"
    .end annotation

    return-void
.end method

.method public static synthetic getConnectedAccountName$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "connected_account_name"
    .end annotation

    return-void
.end method

.method public static synthetic getConsentRequired$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "consent_required"
    .end annotation

    return-void
.end method

.method public static synthetic getCustomManualEntryHandling$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "custom_manual_entry_handling"
    .end annotation

    return-void
.end method

.method public static synthetic getDisableLinkMoreAccounts$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "disable_link_more_accounts"
    .end annotation

    return-void
.end method

.method public static synthetic getExperimentAssignments$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "experiment_assignments"
    .end annotation

    return-void
.end method

.method public static synthetic getFeatures$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "features"
    .end annotation

    return-void
.end method

.method public static synthetic getHostedAuthUrl$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "hosted_auth_url"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getInitialInstitution$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "initial_institution"
    .end annotation

    return-void
.end method

.method public static synthetic getInstantVerificationDisabled$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "instant_verification_disabled"
    .end annotation

    return-void
.end method

.method public static synthetic getInstitutionSearchDisabled$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "institution_search_disabled"
    .end annotation

    return-void
.end method

.method public static synthetic getLinkAccountSessionCancellationBehavior$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "link_account_session_cancellation_behavior"
    .end annotation

    return-void
.end method

.method public static synthetic getLivemode$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "livemode"
    .end annotation

    return-void
.end method

.method public static synthetic getManualEntryMode$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "manual_entry_mode"
    .end annotation

    return-void
.end method

.method public static synthetic getManualEntryUsesMicrodeposits$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "manual_entry_uses_microdeposits"
    .end annotation

    return-void
.end method

.method public static synthetic getMobileHandoffEnabled$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "mobile_handoff_enabled"
    .end annotation

    return-void
.end method

.method public static synthetic getModalCustomization$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "modal_customization"
    .end annotation

    return-void
.end method

.method public static synthetic getNextPane$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "next_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentMethodType$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "payment_method_type"
    .end annotation

    return-void
.end method

.method public static synthetic getPermissions$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "permissions"
    .end annotation

    return-void
.end method

.method public static synthetic getProduct$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "product"
    .end annotation

    return-void
.end method

.method public static synthetic getSingleAccount$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "single_account"
    .end annotation

    return-void
.end method

.method public static synthetic getSkipSuccessPane$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "skip_success_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getStepUpAuthenticationRequired$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "step_up_authentication_required"
    .end annotation

    return-void
.end method

.method public static synthetic getSuccessUrl$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "success_url"
    .end annotation

    return-void
.end method

.method public static synthetic getUseSingleSortSearch$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "use_single_sort_search"
    .end annotation

    return-void
.end method

.method public static synthetic isEndUserFacing$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "is_end_user_facing"
    .end annotation

    return-void
.end method

.method public static synthetic isLinkWithStripe$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "is_link_with_stripe"
    .end annotation

    return-void
.end method

.method public static synthetic isNetworkingUserFlow$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "is_networking_user_flow"
    .end annotation

    return-void
.end method

.method public static synthetic isStripeDirect$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "is_stripe_direct"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;LUt0;LMs5;)V
    .locals 6
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LUt0;->v(LMs5;IZ)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0}, LUt0;->v(LMs5;IZ)V

    const/4 v0, 0x2

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/4 v0, 0x3

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/4 v0, 0x4

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/4 v0, 0x6

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/4 v0, 0x7

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/16 v0, 0x8

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/16 v0, 0x9

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v4, 0xa

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    const/16 v4, 0xb

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    new-instance v0, Lro;

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions$Serializer;

    invoke-direct {v0, v3}, Lro;-><init>(LKj2;)V

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    const/16 v4, 0xc

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product$Serializer;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    const/16 v4, 0xd

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/16 v0, 0xe

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/16 v0, 0xf

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_0
    move v3, v2

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_1
    if-eqz v3, :cond_2

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod$Serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_2
    move v3, v2

    goto :goto_3

    :cond_3
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v1

    :goto_3
    if-eqz v3, :cond_5

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v2

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v1

    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v3, v2

    goto :goto_7

    :cond_9
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    move v3, v1

    :goto_7
    if-eqz v3, :cond_b

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x14

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_8
    move v3, v2

    goto :goto_9

    :cond_c
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    if-eqz v3, :cond_d

    goto :goto_8

    :cond_d
    move v3, v1

    :goto_9
    if-eqz v3, :cond_e

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_e
    const/16 v0, 0x15

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_f

    :goto_a
    move v3, v2

    goto :goto_b

    :cond_f
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    if-eqz v3, :cond_10

    goto :goto_a

    :cond_10
    move v3, v1

    :goto_b
    if-eqz v3, :cond_11

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x16

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_12

    :goto_c
    move v3, v2

    goto :goto_d

    :cond_12
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-eqz v3, :cond_13

    goto :goto_c

    :cond_13
    move v3, v1

    :goto_d
    if-eqz v3, :cond_14

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_14
    const/16 v0, 0x17

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_15

    :goto_e
    move v3, v2

    goto :goto_f

    :cond_15
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    if-eqz v3, :cond_16

    goto :goto_e

    :cond_16
    move v3, v1

    :goto_f
    if-eqz v3, :cond_17

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_17
    const/16 v0, 0x18

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_18

    :goto_10
    move v3, v2

    goto :goto_11

    :cond_18
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    if-eqz v3, :cond_19

    goto :goto_10

    :cond_19
    move v3, v1

    :goto_11
    if-eqz v3, :cond_1a

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_1a
    const/16 v0, 0x19

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_1b

    :goto_12
    move v3, v2

    goto :goto_13

    :cond_1b
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    if-eqz v3, :cond_1c

    goto :goto_12

    :cond_1c
    move v3, v1

    :goto_13
    if-eqz v3, :cond_1d

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_1d
    const/16 v0, 0x1a

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_1e

    :goto_14
    move v3, v2

    goto :goto_15

    :cond_1e
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    if-eqz v3, :cond_1f

    goto :goto_14

    :cond_1f
    move v3, v1

    :goto_15
    if-eqz v3, :cond_20

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_20
    const/16 v0, 0x1b

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_21

    :goto_16
    move v3, v2

    goto :goto_17

    :cond_21
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    if-eqz v3, :cond_22

    goto :goto_16

    :cond_22
    move v3, v1

    :goto_17
    if-eqz v3, :cond_23

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_23
    const/16 v0, 0x1c

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_24

    :goto_18
    move v3, v2

    goto :goto_19

    :cond_24
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    if-eqz v3, :cond_25

    goto :goto_18

    :cond_25
    move v3, v1

    :goto_19
    if-eqz v3, :cond_26

    new-instance v3, LQr2;

    sget-object v4, LgS5;->a:LgS5;

    invoke-direct {v3, v4, v4}, LQr2;-><init>(LKj2;LKj2;)V

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_26
    const/16 v0, 0x1d

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_27

    :goto_1a
    move v3, v2

    goto :goto_1b

    :cond_27
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    if-eqz v3, :cond_28

    goto :goto_1a

    :cond_28
    move v3, v1

    :goto_1b
    if-eqz v3, :cond_29

    new-instance v3, LQr2;

    sget-object v4, LgS5;->a:LgS5;

    sget-object v5, LYY;->a:LYY;

    invoke-direct {v3, v4, v5}, LQr2;-><init>(LKj2;LKj2;)V

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_29
    const/16 v0, 0x1e

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_2a

    :goto_1c
    move v3, v2

    goto :goto_1d

    :cond_2a
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    if-eqz v3, :cond_2b

    goto :goto_1c

    :cond_2b
    move v3, v1

    :goto_1d
    if-eqz v3, :cond_2c

    sget-object v3, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2c
    const/16 v0, 0x1f

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_2d

    :goto_1e
    move v3, v2

    goto :goto_1f

    :cond_2d
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-eqz v3, :cond_2e

    goto :goto_1e

    :cond_2e
    move v3, v1

    :goto_1f
    if-eqz v3, :cond_2f

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2f
    const/16 v0, 0x20

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_30

    :goto_20
    move v3, v2

    goto :goto_21

    :cond_30
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    if-eqz v3, :cond_31

    goto :goto_20

    :cond_31
    move v3, v1

    :goto_21
    if-eqz v3, :cond_32

    sget-object v3, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_32
    const/16 v0, 0x21

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_33

    :goto_22
    move v3, v2

    goto :goto_23

    :cond_33
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    if-eqz v3, :cond_34

    goto :goto_22

    :cond_34
    move v3, v1

    :goto_23
    if-eqz v3, :cond_35

    sget-object v3, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_35
    const/16 v0, 0x22

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_36

    :goto_24
    move v3, v2

    goto :goto_25

    :cond_36
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    if-eqz v3, :cond_37

    goto :goto_24

    :cond_37
    move v3, v1

    :goto_25
    if-eqz v3, :cond_38

    sget-object v3, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_38
    const/16 v0, 0x23

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_39

    :goto_26
    move v3, v2

    goto :goto_27

    :cond_39
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    if-eqz v3, :cond_3a

    goto :goto_26

    :cond_3a
    move v3, v1

    :goto_27
    if-eqz v3, :cond_3b

    sget-object v3, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_3b
    const/16 v0, 0x24

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v0

    if-eqz v0, :cond_3c

    :goto_28
    move v0, v2

    goto :goto_29

    :cond_3c
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    if-eqz v0, :cond_3d

    goto :goto_28

    :cond_3d
    move v0, v1

    :goto_29
    if-eqz v0, :cond_3e

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior$Serializer;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    const/16 v4, 0x24

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_3e
    const/16 v0, 0x25

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v0

    if-eqz v0, :cond_3f

    :goto_2a
    move v0, v2

    goto :goto_2b

    :cond_3f
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    if-eqz v0, :cond_40

    goto :goto_2a

    :cond_40
    move v0, v1

    :goto_2b
    if-eqz v0, :cond_41

    new-instance v0, LQr2;

    sget-object v3, LgS5;->a:LgS5;

    sget-object v4, LYY;->a:LYY;

    invoke-direct {v0, v3, v4}, LQr2;-><init>(LKj2;LKj2;)V

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    const/16 v4, 0x25

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_41
    const/16 v0, 0x26

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v0

    if-eqz v0, :cond_42

    :goto_2c
    move v0, v2

    goto :goto_2d

    :cond_42
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    if-eqz v0, :cond_43

    goto :goto_2c

    :cond_43
    move v0, v1

    :goto_2d
    if-eqz v0, :cond_44

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes$Serializer;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    const/16 v4, 0x26

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_44
    const/16 v0, 0x27

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v0

    if-eqz v0, :cond_45

    :goto_2e
    move v0, v2

    goto :goto_2f

    :cond_45
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    if-eqz v0, :cond_46

    goto :goto_2e

    :cond_46
    move v0, v1

    :goto_2f
    if-eqz v0, :cond_47

    sget-object v0, LYY;->a:LYY;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    const/16 v4, 0x27

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_47
    const/16 v0, 0x28

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v0

    if-eqz v0, :cond_48

    :goto_30
    move v0, v2

    goto :goto_31

    :cond_48
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    if-eqz v0, :cond_49

    goto :goto_30

    :cond_49
    move v0, v1

    :goto_31
    if-eqz v0, :cond_4a

    sget-object v0, LgS5;->a:LgS5;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    const/16 v4, 0x28

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_4a
    const/16 v0, 0x29

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v0

    if-eqz v0, :cond_4b

    :goto_32
    move v1, v2

    goto :goto_33

    :cond_4b
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    if-eqz v0, :cond_4c

    goto :goto_32

    :cond_4c
    :goto_33
    if-eqz v1, :cond_4d

    sget-object v0, LYY;->a:LYY;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    const/16 v1, 0x29

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_4d
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    return v0
.end method

.method public final component11()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final component12()Lcom/stripe/android/financialconnections/model/ManualEntryMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    return-object v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    return v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    return v0
.end method

.method public final component17()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    return v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    return-object v0
.end method

.method public final component23()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    return-object v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    return v0
.end method

.method public final component30()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    return-object v0
.end method

.method public final component31()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component32()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final component33()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component34()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component35()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component36()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component37()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    return-object v0
.end method

.method public final component38()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    return-object v0
.end method

.method public final component39()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    return v0
.end method

.method public final component40()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component41()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component42()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    return v0
.end method

.method public final copy(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZ",
            "Ljava/lang/String;",
            "ZZZZZ",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;",
            "ZZ",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;"
        }
    .end annotation

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

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

    const-string v0, "id"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextPane"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manualEntryMode"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissions"

    move-object/from16 v1, p13

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "product"

    move-object/from16 v1, p14

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v43, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-object/from16 v0, v43

    move/from16 v1, p1

    invoke-direct/range {v0 .. v42}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;-><init>(ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v43
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    if-eq v1, v3, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2b

    return v2

    :cond_2b
    return v0
.end method

.method public final getAccountDisconnectionMethod()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    return-object v0
.end method

.method public final getAccountholderCustomerEmailAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getAccountholderIsLinkConsumer()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getAccountholderPhoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final getAccountholderToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getActiveAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    return-object v0
.end method

.method public final getActiveInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final getAllowManualEntry()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    return v0
.end method

.method public final getAssignmentEventId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    return-object v0
.end method

.method public final getBusinessName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCancelUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectPlatformName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    return-object v0
.end method

.method public final getConnectedAccountName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    return-object v0
.end method

.method public final getConsentRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    return v0
.end method

.method public final getCustomManualEntryHandling()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    return v0
.end method

.method public final getDisableLinkMoreAccounts()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    return v0
.end method

.method public final getExperimentAssignments()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    return-object v0
.end method

.method public final getFeatures()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    return-object v0
.end method

.method public final getHostedAuthUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInitialInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    return-object v0
.end method

.method public final getInstantVerificationDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    return v0
.end method

.method public final getInstitutionSearchDisabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    return v0
.end method

.method public final getLinkAccountSessionCancellationBehavior()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    return-object v0
.end method

.method public final getLivemode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    return v0
.end method

.method public final getManualEntryMode()Lcom/stripe/android/financialconnections/model/ManualEntryMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    return-object v0
.end method

.method public final getManualEntryUsesMicrodeposits()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    return v0
.end method

.method public final getMobileHandoffEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    return v0
.end method

.method public final getModalCustomization()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    return-object v0
.end method

.method public final getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final getPaymentMethodType()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    return-object v0
.end method

.method public final getPermissions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public final getProduct()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    return-object v0
.end method

.method public final getSingleAccount()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    return v0
.end method

.method public final getSkipSuccessPane()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStepUpAuthenticationRequired()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSuccessUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getUseSingleSortSearch()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    if-eqz v2, :cond_4

    move v2, v1

    :cond_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    if-eqz v2, :cond_5

    move v2, v1

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    if-eqz v2, :cond_6

    move v2, v1

    :cond_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    if-eqz v2, :cond_7

    move v2, v1

    :cond_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    if-eqz v2, :cond_8

    move v2, v1

    :cond_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    if-eqz v2, :cond_9

    move v2, v1

    :cond_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    if-eqz v2, :cond_a

    goto :goto_0

    :cond_a
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_1

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_2

    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_3

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_4

    :cond_e
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_5

    :cond_f
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_6

    :cond_10
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_7

    :cond_11
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_8

    :cond_12
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_9

    :cond_13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    if-nez v1, :cond_14

    move v1, v2

    goto :goto_a

    :cond_14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_b

    :cond_15
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    if-nez v1, :cond_16

    move v1, v2

    goto :goto_c

    :cond_16
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_d

    :cond_17
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    if-nez v1, :cond_18

    move v1, v2

    goto :goto_e

    :cond_18
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    if-nez v1, :cond_19

    move v1, v2

    goto :goto_f

    :cond_19
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-nez v1, :cond_1a

    move v1, v2

    goto :goto_10

    :cond_1a
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    if-nez v1, :cond_1b

    move v1, v2

    goto :goto_11

    :cond_1b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    if-nez v1, :cond_1c

    move v1, v2

    goto :goto_12

    :cond_1c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_1d

    move v1, v2

    goto :goto_13

    :cond_1d
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    if-nez v1, :cond_1e

    move v1, v2

    goto :goto_14

    :cond_1e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    if-nez v1, :cond_1f

    move v1, v2

    goto :goto_15

    :cond_1f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    if-nez v1, :cond_20

    move v1, v2

    goto :goto_16

    :cond_20
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    if-nez v1, :cond_21

    move v1, v2

    goto :goto_17

    :cond_21
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_17
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    if-nez v1, :cond_22

    move v1, v2

    goto :goto_18

    :cond_22
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    if-nez v1, :cond_23

    move v1, v2

    goto :goto_19

    :cond_23
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    if-nez v1, :cond_24

    goto :goto_1a

    :cond_24
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1a
    add-int/2addr v0, v2

    return v0
.end method

.method public final isEndUserFacing()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isLinkWithStripe()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isNetworkingUserFlow()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isStripeDirect()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 44

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    iget-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    iget-boolean v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    iget-boolean v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    iget-boolean v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    iget-boolean v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    iget-boolean v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    iget-boolean v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    iget-boolean v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    iget-object v11, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v12, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    iget-object v13, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    iget-object v14, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    iget-boolean v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    move/from16 v16, v15

    iget-boolean v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    move/from16 v17, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    move-object/from16 v28, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    move-object/from16 v29, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    move-object/from16 v30, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    move-object/from16 v31, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    move-object/from16 v32, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object/from16 v33, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    move-object/from16 v34, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    move-object/from16 v35, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    move-object/from16 v36, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    move-object/from16 v37, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    move-object/from16 v38, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    move-object/from16 v39, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    move-object/from16 v40, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    move-object/from16 v41, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    move-object/from16 v42, v15

    iget-object v15, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v43, v15

    const-string v15, "FinancialConnectionsSessionManifest(allowManualEntry="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", consentRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", customManualEntryHandling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", disableLinkMoreAccounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", instantVerificationDisabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", institutionSearchDisabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", livemode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", manualEntryUsesMicrodeposits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mobileHandoffEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", nextPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", manualEntryMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", product="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", singleAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", useSingleSortSearch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", accountDisconnectionMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", accountholderCustomerEmailAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", accountholderIsLinkConsumer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", accountholderPhoneNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", accountholderToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", activeAuthSession="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activeInstitution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", assignmentEventId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", businessName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cancelUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", connectPlatformName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", connectedAccountName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", experimentAssignments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", features="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hostedAuthUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", initialInstitution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEndUserFacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isLinkWithStripe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isNetworkingUserFlow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isStripeDirect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkAccountSessionCancellationBehavior="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modalCustomization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethodType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stepUpAuthenticationRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", successUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", skipSuccessPane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->allowManualEntry:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->consentRequired:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->customManualEntryHandling:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->disableLinkMoreAccounts:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->instantVerificationDisabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->institutionSearchDisabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->livemode:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryUsesMicrodeposits:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->mobileHandoffEnabled:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->manualEntryMode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->permissions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->product:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->singleAccount:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->useSingleSortSearch:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountDisconnectionMethod:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderCustomerEmailAddress:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderIsLinkConsumer:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderPhoneNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->accountholderToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeAuthSession:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->activeInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_4
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->assignmentEventId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->businessName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->cancelUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectPlatformName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->connectedAccountName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->experimentAssignments:Ljava/util/Map;

    if-nez v0, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    :goto_6
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->features:Ljava/util/Map;

    if-nez v0, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    :cond_7
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7

    :cond_8
    :goto_8
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->hostedAuthUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->initialInstitution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    if-nez v0, :cond_9

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_9
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isEndUserFacing:Ljava/lang/Boolean;

    if-nez p2, :cond_a

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_a
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe:Ljava/lang/Boolean;

    if-nez p2, :cond_b

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_b
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow:Ljava/lang/Boolean;

    if-nez p2, :cond_c

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_c
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect:Ljava/lang/Boolean;

    if-nez p2, :cond_d

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_d
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->linkAccountSessionCancellationBehavior:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;

    if-nez p2, :cond_e

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_e
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->modalCustomization:Ljava/util/Map;

    if-nez p2, :cond_f

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_10

    :cond_f
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_f
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_f

    :cond_10
    :goto_10
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->paymentMethodType:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;

    if-nez p2, :cond_11

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_11

    :cond_11
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_11
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->stepUpAuthenticationRequired:Ljava/lang/Boolean;

    if-nez p2, :cond_12

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_12

    :cond_12
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_12
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->successUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->skipSuccessPane:Ljava/lang/Boolean;

    if-nez p2, :cond_13

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_13

    :cond_13
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_13
    return-void
.end method
