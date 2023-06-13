.class public final Lco/bird/android/model/persistence/Area;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/Polygonable;
.implements Lco/bird/android/model/ZoomBehaviorable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008:\n\u0002\u0010\u0000\n\u0002\u0008J\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\u00b1\u0004\u0012\u0006\u0010H\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010K\u001a\u00020\u000e\u0012\u0006\u0010L\u001a\u00020\u000e\u0012\u0006\u0010M\u001a\u00020\u000e\u0012\u0006\u0010N\u001a\u00020\u000e\u0012\u0006\u0010O\u001a\u00020\u000e\u0012\u0006\u0010P\u001a\u00020\u000e\u0012\u0006\u0010Q\u001a\u00020\u000e\u0012\u0006\u0010R\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010\u001d\u0012\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010X\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010Y\u001a\u00020!\u0012\u0006\u0010Z\u001a\u00020\u0019\u0012\u0008\u0010[\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\\\u001a\u00020\u0019\u0012\u0008\u0010]\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010^\u001a\u00020\u0019\u0012\u0008\u0010_\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010`\u001a\u00020)\u0012\u0006\u0010a\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010b\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010c\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010d\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010h\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010i\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010j\u001a\u00020\u001d\u0012\u0006\u0010k\u001a\u00020\u001d\u0012\u0006\u0010l\u001a\u00020\u001d\u0012\n\u0008\u0002\u0010m\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0002\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108\u0012\u0010\u0008\u0002\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108\u0012\u0006\u0010p\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010q\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010r\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010s\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010t\u001a\u0004\u0018\u00010\u0019\u0012\u0010\u0008\u0002\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108\u0012\n\u0008\u0002\u0010v\u001a\u0004\u0018\u00010A\u0012\u0006\u0010w\u001a\u00020\u0003\u0012\u0006\u0010x\u001a\u00020D\u0012\n\u0008\u0002\u0010y\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010z\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0006\u0008\u00d0\u0001\u0010\u00d1\u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0008\u001a\u00020\u0007J\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u000eH\u00c6\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020!H\u00c6\u0003J\t\u0010#\u001a\u00020\u0019H\u00c6\u0003J\u0012\u0010$\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001bJ\t\u0010%\u001a\u00020\u0019H\u00c6\u0003J\u0012\u0010&\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001bJ\t\u0010\'\u001a\u00020\u0019H\u00c6\u0003J\u0012\u0010(\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\u001bJ\t\u0010*\u001a\u00020)H\u00c6\u0003J\t\u0010+\u001a\u00020\u000eH\u00c6\u0003J\u0012\u0010,\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\u001bJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\u001bJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u001dH\u00c6\u0003J\t\u00105\u001a\u00020\u001dH\u00c6\u0003J\t\u00106\u001a\u00020\u001dH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108H\u00c6\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108H\u00c6\u0003J\t\u0010;\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010?\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010\u001bJ\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000108H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010AH\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020DH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010G\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008G\u0010\u0018J\u00e8\u0004\u0010{\u001a\u00020\u00002\u0008\u0008\u0002\u0010H\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010K\u001a\u00020\u000e2\u0008\u0008\u0002\u0010L\u001a\u00020\u000e2\u0008\u0008\u0002\u0010M\u001a\u00020\u000e2\u0008\u0008\u0002\u0010N\u001a\u00020\u000e2\u0008\u0008\u0002\u0010O\u001a\u00020\u000e2\u0008\u0008\u0002\u0010P\u001a\u00020\u000e2\u0008\u0008\u0002\u0010Q\u001a\u00020\u000e2\u0008\u0008\u0002\u0010R\u001a\u00020\u000e2\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010X\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010Y\u001a\u00020!2\u0008\u0008\u0002\u0010Z\u001a\u00020\u00192\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010\\\u001a\u00020\u00192\n\u0008\u0002\u0010]\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010^\u001a\u00020\u00192\n\u0008\u0002\u0010_\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010`\u001a\u00020)2\u0008\u0008\u0002\u0010a\u001a\u00020\u000e2\n\u0008\u0002\u0010b\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010c\u001a\u0004\u0018\u00010\u00192\n\u0008\u0002\u0010d\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010g\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010h\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010i\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010j\u001a\u00020\u001d2\u0008\u0008\u0002\u0010k\u001a\u00020\u001d2\u0008\u0008\u0002\u0010l\u001a\u00020\u001d2\n\u0008\u0002\u0010m\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001082\u0010\u0008\u0002\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001082\u0008\u0008\u0002\u0010p\u001a\u00020\u000e2\n\u0008\u0002\u0010q\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010r\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010s\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010t\u001a\u0004\u0018\u00010\u00192\u0010\u0008\u0002\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001082\n\u0008\u0002\u0010v\u001a\u0004\u0018\u00010A2\u0008\u0008\u0002\u0010w\u001a\u00020\u00032\u0008\u0008\u0002\u0010x\u001a\u00020D2\n\u0008\u0002\u0010y\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010z\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0004\u0008{\u0010|J\t\u0010}\u001a\u00020\u0003H\u00d6\u0001J\t\u0010~\u001a\u00020\u0019H\u00d6\u0001J\u0015\u0010\u0081\u0001\u001a\u00020\u000e2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007fH\u00d6\u0003R\u001d\u0010H\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u000f\n\u0005\u0008H\u0010\u0082\u0001\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0004\u0010\u0082\u0001\u001a\u0006\u0008\u0085\u0001\u0010\u0084\u0001R\u001f\u0010I\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008I\u0010\u0082\u0001\u001a\u0006\u0008\u0086\u0001\u0010\u0084\u0001R\u001f\u0010J\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008J\u0010\u0082\u0001\u001a\u0006\u0008\u0087\u0001\u0010\u0084\u0001R\u001d\u0010K\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008K\u0010\u0088\u0001\u001a\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u001d\u0010L\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008L\u0010\u0088\u0001\u001a\u0006\u0008\u008b\u0001\u0010\u008a\u0001R\u001d\u0010M\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008M\u0010\u0088\u0001\u001a\u0006\u0008\u008c\u0001\u0010\u008a\u0001R\u001d\u0010N\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008N\u0010\u0088\u0001\u001a\u0006\u0008\u008d\u0001\u0010\u008a\u0001R\u001d\u0010O\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008O\u0010\u0088\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u008a\u0001R\u001d\u0010P\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008P\u0010\u0088\u0001\u001a\u0006\u0008\u008f\u0001\u0010\u008a\u0001R\u001c\u0010Q\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008Q\u0010\u0088\u0001\u001a\u0005\u0008Q\u0010\u008a\u0001R\u001c\u0010R\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008R\u0010\u0088\u0001\u001a\u0005\u0008R\u0010\u008a\u0001R\u001e\u0010S\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008S\u0010\u0090\u0001\u001a\u0005\u0008\u0091\u0001\u0010\u0018R\u001e\u0010T\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008T\u0010\u0092\u0001\u001a\u0005\u0008\u0093\u0001\u0010\u001bR\u001f\u0010U\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008U\u0010\u0082\u0001\u001a\u0006\u0008\u0094\u0001\u0010\u0084\u0001R\u001f\u0010V\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008V\u0010\u0095\u0001\u001a\u0006\u0008\u0096\u0001\u0010\u0097\u0001R\u001e\u0010W\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008W\u0010\u0092\u0001\u001a\u0005\u0008\u0098\u0001\u0010\u001bR\u001f\u0010X\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008X\u0010\u0082\u0001\u001a\u0006\u0008\u0099\u0001\u0010\u0084\u0001R\u001d\u0010Y\u001a\u00020!8\u0016X\u0097\u0004\u00a2\u0006\u000f\n\u0005\u0008Y\u0010\u009a\u0001\u001a\u0006\u0008\u009b\u0001\u0010\u009c\u0001R\u001d\u0010Z\u001a\u00020\u00198\u0016X\u0097\u0004\u00a2\u0006\u000f\n\u0005\u0008Z\u0010\u009d\u0001\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001R\u001e\u0010[\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008[\u0010\u0092\u0001\u001a\u0005\u0008\u00a0\u0001\u0010\u001bR\u001d\u0010\\\u001a\u00020\u00198\u0016X\u0097\u0004\u00a2\u0006\u000f\n\u0005\u0008\\\u0010\u009d\u0001\u001a\u0006\u0008\u00a1\u0001\u0010\u009f\u0001R\u001e\u0010]\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008]\u0010\u0092\u0001\u001a\u0005\u0008\u00a2\u0001\u0010\u001bR\u001d\u0010^\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008^\u0010\u009d\u0001\u001a\u0006\u0008\u00a3\u0001\u0010\u009f\u0001R\u001e\u0010_\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008_\u0010\u0092\u0001\u001a\u0005\u0008\u00a4\u0001\u0010\u001bR\u001d\u0010`\u001a\u00020)8\u0016X\u0097\u0004\u00a2\u0006\u000f\n\u0005\u0008`\u0010\u00a5\u0001\u001a\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R\u001d\u0010a\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008a\u0010\u0088\u0001\u001a\u0006\u0008\u00a8\u0001\u0010\u008a\u0001R\u001e\u0010b\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008b\u0010\u0092\u0001\u001a\u0005\u0008\u00a9\u0001\u0010\u001bR\u001e\u0010c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008c\u0010\u0092\u0001\u001a\u0005\u0008\u00aa\u0001\u0010\u001bR\u001f\u0010d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008d\u0010\u0082\u0001\u001a\u0006\u0008\u00ab\u0001\u0010\u0084\u0001R\u001f\u0010e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008e\u0010\u0082\u0001\u001a\u0006\u0008\u00ac\u0001\u0010\u0084\u0001R\u001f\u0010f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008f\u0010\u0082\u0001\u001a\u0006\u0008\u00ad\u0001\u0010\u0084\u0001R\u001f\u0010g\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008g\u0010\u0082\u0001\u001a\u0006\u0008\u00ae\u0001\u0010\u0084\u0001R\u001f\u0010h\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008h\u0010\u0082\u0001\u001a\u0006\u0008\u00af\u0001\u0010\u0084\u0001R\u001f\u0010i\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008i\u0010\u0082\u0001\u001a\u0006\u0008\u00b0\u0001\u0010\u0084\u0001R\u001d\u0010j\u001a\u00020\u001d8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008j\u0010\u0095\u0001\u001a\u0006\u0008\u00b1\u0001\u0010\u0097\u0001R\u001d\u0010k\u001a\u00020\u001d8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008k\u0010\u0095\u0001\u001a\u0006\u0008\u00b2\u0001\u0010\u0097\u0001R\u001d\u0010l\u001a\u00020\u001d8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008l\u0010\u0095\u0001\u001a\u0006\u0008\u00b3\u0001\u0010\u0097\u0001R\u001f\u0010m\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008m\u0010\u0082\u0001\u001a\u0006\u0008\u00b4\u0001\u0010\u0084\u0001R%\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001088\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008n\u0010\u00b5\u0001\u001a\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R%\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001088\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008o\u0010\u00b5\u0001\u001a\u0006\u0008\u00b8\u0001\u0010\u00b7\u0001R\u001c\u0010p\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008p\u0010\u0088\u0001\u001a\u0005\u0008p\u0010\u008a\u0001R\u001f\u0010q\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008q\u0010\u0082\u0001\u001a\u0006\u0008\u00b9\u0001\u0010\u0084\u0001R\u001f\u0010r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008r\u0010\u0082\u0001\u001a\u0006\u0008\u00ba\u0001\u0010\u0084\u0001R\u001f\u0010s\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008s\u0010\u0082\u0001\u001a\u0006\u0008\u00bb\u0001\u0010\u0084\u0001R\u001e\u0010t\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008t\u0010\u0092\u0001\u001a\u0005\u0008\u00bc\u0001\u0010\u001bR%\u0010u\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001088\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008u\u0010\u00b5\u0001\u001a\u0006\u0008\u00bd\u0001\u0010\u00b7\u0001R\u001f\u0010v\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008v\u0010\u00be\u0001\u001a\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001R\u001d\u0010w\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008w\u0010\u0082\u0001\u001a\u0006\u0008\u00c1\u0001\u0010\u0084\u0001R\u001d\u0010x\u001a\u00020D8\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008x\u0010\u00c2\u0001\u001a\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001R\u001f\u0010y\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000f\n\u0005\u0008y\u0010\u0082\u0001\u001a\u0006\u0008\u00c5\u0001\u0010\u0084\u0001R\u001e\u0010z\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0005\u0008z\u0010\u0090\u0001\u001a\u0005\u0008\u00c6\u0001\u0010\u0018R)\u0010\u00c7\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00c7\u0001\u0010\u0088\u0001\u001a\u0006\u0008\u00c7\u0001\u0010\u008a\u0001\"\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001R!\u0010\u00cf\u0001\u001a\u00030\u00ca\u00018FX\u0087\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001\u001a\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001\u00a8\u0006\u00d2\u0001"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Area;",
        "Lco/bird/android/model/Polygonable;",
        "Lco/bird/android/model/ZoomBehaviorable;",
        "",
        "title",
        "Lco/bird/android/model/constant/PopupInvocationMethod;",
        "popupInvocationMethod",
        "Lco/bird/android/model/constant/PopupType;",
        "popupType",
        "toolTipTitle",
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
        "component11",
        "component12",
        "component13",
        "()Ljava/lang/Boolean;",
        "",
        "component14",
        "()Ljava/lang/Integer;",
        "component15",
        "Lco/bird/android/model/constant/AreaIconType;",
        "component16",
        "component17",
        "component18",
        "Lco/bird/android/model/Polygon;",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "Lco/bird/android/model/constant/ZoomBehavior;",
        "component26",
        "component27",
        "component28",
        "component29",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "component48",
        "component49",
        "Lorg/joda/time/DateTime;",
        "component50",
        "component51",
        "component52",
        "id",
        "label",
        "notes",
        "hideBirds",
        "rejectDrops",
        "noRides",
        "noParking",
        "preferredParking",
        "delivery",
        "isReleaseConstrained",
        "isDemandArea",
        "feeModified",
        "demandLevel",
        "overlayLabel",
        "overlayIcon",
        "overlayMinZoomLevel",
        "selectedOverlayLabel",
        "region",
        "color",
        "colorDark",
        "borderColor",
        "borderColorDark",
        "titleColor",
        "titleColorDark",
        "zoomBehavior",
        "operational",
        "maxSpeed",
        "releaseCapacity",
        "noParkingFineAlertTitle",
        "noParkingFineAlertMessage",
        "riderBarInRideMessageTitle",
        "riderBarInRideMessageBody",
        "riderBarNotInRideMessageTitle",
        "riderBarNotInRideMessageBody",
        "riderBarInRideMessageIconType",
        "riderBarNotInRideMessageIconType",
        "areaReleaseCapacityIconType",
        "partnerId",
        "fleetIds",
        "areaKeys",
        "isUniversalArea",
        "noParkingFineCurrency",
        "noParkingWarningAlertTitle",
        "noParkingWarningAlertBody",
        "noParkingFineAmount",
        "areasMerged",
        "centerPoint",
        "role",
        "updatedAt",
        "zoneId",
        "walkway",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)Lco/bird/android/model/persistence/Area;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "getTitle",
        "getLabel",
        "getNotes",
        "Z",
        "getHideBirds",
        "()Z",
        "getRejectDrops",
        "getNoRides",
        "getNoParking",
        "getPreferredParking",
        "getDelivery",
        "Ljava/lang/Boolean;",
        "getFeeModified",
        "Ljava/lang/Integer;",
        "getDemandLevel",
        "getOverlayLabel",
        "Lco/bird/android/model/constant/AreaIconType;",
        "getOverlayIcon",
        "()Lco/bird/android/model/constant/AreaIconType;",
        "getOverlayMinZoomLevel",
        "getSelectedOverlayLabel",
        "Lco/bird/android/model/Polygon;",
        "getRegion",
        "()Lco/bird/android/model/Polygon;",
        "I",
        "getColor",
        "()I",
        "getColorDark",
        "getBorderColor",
        "getBorderColorDark",
        "getTitleColor",
        "getTitleColorDark",
        "Lco/bird/android/model/constant/ZoomBehavior;",
        "getZoomBehavior",
        "()Lco/bird/android/model/constant/ZoomBehavior;",
        "getOperational",
        "getMaxSpeed",
        "getReleaseCapacity",
        "getNoParkingFineAlertTitle",
        "getNoParkingFineAlertMessage",
        "getRiderBarInRideMessageTitle",
        "getRiderBarInRideMessageBody",
        "getRiderBarNotInRideMessageTitle",
        "getRiderBarNotInRideMessageBody",
        "getRiderBarInRideMessageIconType",
        "getRiderBarNotInRideMessageIconType",
        "getAreaReleaseCapacityIconType",
        "getPartnerId",
        "Ljava/util/List;",
        "getFleetIds",
        "()Ljava/util/List;",
        "getAreaKeys",
        "getNoParkingFineCurrency",
        "getNoParkingWarningAlertTitle",
        "getNoParkingWarningAlertBody",
        "getNoParkingFineAmount",
        "getAreasMerged",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "getCenterPoint",
        "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "getRole",
        "Lorg/joda/time/DateTime;",
        "getUpdatedAt",
        "()Lorg/joda/time/DateTime;",
        "getZoneId",
        "getWalkway",
        "isOperationalInverse",
        "setOperationalInverse",
        "(Z)V",
        "LCX3;",
        "jtsRegion$delegate",
        "Lkotlin/Lazy;",
        "getJtsRegion",
        "()LCX3;",
        "jtsRegion",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)V",
        "model-persistence_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final areaKeys:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final areaReleaseCapacityIconType:Lco/bird/android/model/constant/AreaIconType;

.field private final areasMerged:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final borderColor:I

.field private final borderColorDark:Ljava/lang/Integer;

.field private final centerPoint:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

.field private final color:I

.field private final colorDark:Ljava/lang/Integer;

.field private final delivery:Z

.field private final demandLevel:Ljava/lang/Integer;

.field private final feeModified:Ljava/lang/Boolean;

.field private final fleetIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final hideBirds:Z

.field private final id:Ljava/lang/String;

.field private final isDemandArea:Z

.field private isOperationalInverse:Z

.field private final isReleaseConstrained:Z

.field private final isUniversalArea:Z

.field private final jtsRegion$delegate:Lkotlin/Lazy;

.field private final label:Ljava/lang/String;

.field private final maxSpeed:Ljava/lang/Integer;

.field private final noParking:Z

.field private final noParkingFineAlertMessage:Ljava/lang/String;

.field private final noParkingFineAlertTitle:Ljava/lang/String;

.field private final noParkingFineAmount:Ljava/lang/Integer;

.field private final noParkingFineCurrency:Ljava/lang/String;

.field private final noParkingWarningAlertBody:Ljava/lang/String;

.field private final noParkingWarningAlertTitle:Ljava/lang/String;

.field private final noRides:Z

.field private final notes:Ljava/lang/String;

.field private final operational:Z

.field private final overlayIcon:Lco/bird/android/model/constant/AreaIconType;

.field private final overlayLabel:Ljava/lang/String;

.field private final overlayMinZoomLevel:Ljava/lang/Integer;

.field private final partnerId:Ljava/lang/String;

.field private final preferredParking:Z

.field private final region:Lco/bird/android/model/Polygon;

.field private final rejectDrops:Z

.field private final releaseCapacity:Ljava/lang/Integer;

.field private final riderBarInRideMessageBody:Ljava/lang/String;

.field private final riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

.field private final riderBarInRideMessageTitle:Ljava/lang/String;

.field private final riderBarNotInRideMessageBody:Ljava/lang/String;

.field private final riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

.field private final riderBarNotInRideMessageTitle:Ljava/lang/String;

.field private final role:Ljava/lang/String;

.field private final selectedOverlayLabel:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final titleColor:I

.field private final titleColorDark:Ljava/lang/Integer;

.field private final updatedAt:Lorg/joda/time/DateTime;

.field private final walkway:Ljava/lang/Boolean;

.field private final zoneId:Ljava/lang/String;

.field private final zoomBehavior:Lco/bird/android/model/constant/ZoomBehavior;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZZZZ",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/Polygon;",
            "I",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/lang/Integer;",
            "Lco/bird/android/model/constant/ZoomBehavior;",
            "Z",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p19

    move-object/from16 v3, p26

    move-object/from16 v4, p36

    move-object/from16 v5, p37

    move-object/from16 v6, p38

    move-object/from16 v7, p49

    move-object/from16 v8, p50

    const-string v9, "id"

    invoke-static {p1, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "region"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "zoomBehavior"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "riderBarInRideMessageIconType"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "riderBarNotInRideMessageIconType"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "areaReleaseCapacityIconType"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "role"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "updatedAt"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->id:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->label:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->notes:Ljava/lang/String;

    move v1, p5

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->hideBirds:Z

    move/from16 v1, p6

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->rejectDrops:Z

    move/from16 v1, p7

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->noRides:Z

    move/from16 v1, p8

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->noParking:Z

    move/from16 v1, p9

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->preferredParking:Z

    move/from16 v1, p10

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->delivery:Z

    move/from16 v1, p11

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    move/from16 v1, p12

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->isDemandArea:Z

    move-object/from16 v1, p13

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->feeModified:Ljava/lang/Boolean;

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->demandLevel:Ljava/lang/Integer;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->overlayLabel:Ljava/lang/String;

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->overlayIcon:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v1, p17

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->overlayMinZoomLevel:Ljava/lang/Integer;

    move-object/from16 v1, p18

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->selectedOverlayLabel:Ljava/lang/String;

    iput-object v2, v0, Lco/bird/android/model/persistence/Area;->region:Lco/bird/android/model/Polygon;

    move/from16 v1, p20

    iput v1, v0, Lco/bird/android/model/persistence/Area;->color:I

    move-object/from16 v1, p21

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->colorDark:Ljava/lang/Integer;

    move/from16 v1, p22

    iput v1, v0, Lco/bird/android/model/persistence/Area;->borderColor:I

    move-object/from16 v1, p23

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->borderColorDark:Ljava/lang/Integer;

    move/from16 v1, p24

    iput v1, v0, Lco/bird/android/model/persistence/Area;->titleColor:I

    move-object/from16 v1, p25

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->titleColorDark:Ljava/lang/Integer;

    iput-object v3, v0, Lco/bird/android/model/persistence/Area;->zoomBehavior:Lco/bird/android/model/constant/ZoomBehavior;

    move/from16 v1, p27

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->operational:Z

    move-object/from16 v1, p28

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->maxSpeed:Ljava/lang/Integer;

    move-object/from16 v1, p29

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    move-object/from16 v1, p30

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertTitle:Ljava/lang/String;

    move-object/from16 v1, p31

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertMessage:Ljava/lang/String;

    move-object/from16 v1, p32

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageTitle:Ljava/lang/String;

    move-object/from16 v1, p33

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageBody:Ljava/lang/String;

    move-object/from16 v1, p34

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    move-object/from16 v1, p35

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageBody:Ljava/lang/String;

    iput-object v4, v0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    iput-object v5, v0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    iput-object v6, v0, Lco/bird/android/model/persistence/Area;->areaReleaseCapacityIconType:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v1, p39

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->partnerId:Ljava/lang/String;

    move-object/from16 v1, p40

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->fleetIds:Ljava/util/List;

    move-object/from16 v1, p41

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->areaKeys:Ljava/util/List;

    move/from16 v1, p42

    iput-boolean v1, v0, Lco/bird/android/model/persistence/Area;->isUniversalArea:Z

    move-object/from16 v1, p43

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingFineCurrency:Ljava/lang/String;

    move-object/from16 v1, p44

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertTitle:Ljava/lang/String;

    move-object/from16 v1, p45

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertBody:Ljava/lang/String;

    move-object/from16 v1, p46

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingFineAmount:Ljava/lang/Integer;

    move-object/from16 v1, p47

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->areasMerged:Ljava/util/List;

    move-object/from16 v1, p48

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->centerPoint:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iput-object v7, v0, Lco/bird/android/model/persistence/Area;->role:Ljava/lang/String;

    iput-object v8, v0, Lco/bird/android/model/persistence/Area;->updatedAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p51

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->zoneId:Ljava/lang/String;

    move-object/from16 v1, p52

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->walkway:Ljava/lang/Boolean;

    new-instance v1, Lco/bird/android/model/persistence/Area$jtsRegion$2;

    invoke-direct {v1, p0}, Lco/bird/android/model/persistence/Area$jtsRegion$2;-><init>(Lco/bird/android/model/persistence/Area;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/model/persistence/Area;->jtsRegion$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 57

    move/from16 v0, p53

    move/from16 v1, p54

    and-int/lit8 v2, v0, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v6, v3

    goto :goto_0

    :cond_0
    move-object/from16 v6, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_1

    move-object v7, v3

    goto :goto_1

    :cond_1
    move-object/from16 v7, p3

    :goto_1
    and-int/lit8 v2, v0, 0x8

    if-eqz v2, :cond_2

    move-object v8, v3

    goto :goto_2

    :cond_2
    move-object/from16 v8, p4

    :goto_2
    and-int/lit16 v2, v0, 0x1000

    if-eqz v2, :cond_3

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v17, v2

    goto :goto_3

    :cond_3
    move-object/from16 v17, p13

    :goto_3
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_4

    move-object/from16 v18, v3

    goto :goto_4

    :cond_4
    move-object/from16 v18, p14

    :goto_4
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_5

    move-object/from16 v19, v3

    goto :goto_5

    :cond_5
    move-object/from16 v19, p15

    :goto_5
    const v2, 0x8000

    and-int v4, v0, v2

    if-eqz v4, :cond_6

    move-object/from16 v20, v3

    goto :goto_6

    :cond_6
    move-object/from16 v20, p16

    :goto_6
    const/high16 v4, 0x10000

    and-int/2addr v4, v0

    if-eqz v4, :cond_7

    move-object/from16 v21, v3

    goto :goto_7

    :cond_7
    move-object/from16 v21, p17

    :goto_7
    const/high16 v4, 0x20000

    and-int/2addr v4, v0

    if-eqz v4, :cond_8

    move-object/from16 v22, v3

    goto :goto_8

    :cond_8
    move-object/from16 v22, p18

    :goto_8
    const/high16 v4, 0x8000000

    and-int/2addr v4, v0

    if-eqz v4, :cond_9

    move-object/from16 v32, v3

    goto :goto_9

    :cond_9
    move-object/from16 v32, p28

    :goto_9
    const/high16 v4, 0x10000000

    and-int/2addr v4, v0

    if-eqz v4, :cond_a

    move-object/from16 v33, v3

    goto :goto_a

    :cond_a
    move-object/from16 v33, p29

    :goto_a
    const/high16 v4, 0x20000000

    and-int/2addr v4, v0

    if-eqz v4, :cond_b

    move-object/from16 v34, v3

    goto :goto_b

    :cond_b
    move-object/from16 v34, p30

    :goto_b
    const/high16 v4, 0x40000000    # 2.0f

    and-int/2addr v4, v0

    if-eqz v4, :cond_c

    move-object/from16 v35, v3

    goto :goto_c

    :cond_c
    move-object/from16 v35, p31

    :goto_c
    const/high16 v4, -0x80000000

    and-int/2addr v0, v4

    if-eqz v0, :cond_d

    move-object/from16 v36, v3

    goto :goto_d

    :cond_d
    move-object/from16 v36, p32

    :goto_d
    and-int/lit8 v0, v1, 0x1

    if-eqz v0, :cond_e

    move-object/from16 v37, v3

    goto :goto_e

    :cond_e
    move-object/from16 v37, p33

    :goto_e
    and-int/lit8 v0, v1, 0x2

    if-eqz v0, :cond_f

    move-object/from16 v38, v3

    goto :goto_f

    :cond_f
    move-object/from16 v38, p34

    :goto_f
    and-int/lit8 v0, v1, 0x4

    if-eqz v0, :cond_10

    move-object/from16 v39, v3

    goto :goto_10

    :cond_10
    move-object/from16 v39, p35

    :goto_10
    and-int/lit8 v0, v1, 0x40

    if-eqz v0, :cond_11

    move-object/from16 v43, v3

    goto :goto_11

    :cond_11
    move-object/from16 v43, p39

    :goto_11
    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_12

    move-object/from16 v44, v3

    goto :goto_12

    :cond_12
    move-object/from16 v44, p40

    :goto_12
    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_13

    move-object/from16 v45, v3

    goto :goto_13

    :cond_13
    move-object/from16 v45, p41

    :goto_13
    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_14

    move-object/from16 v47, v3

    goto :goto_14

    :cond_14
    move-object/from16 v47, p43

    :goto_14
    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_15

    move-object/from16 v48, v3

    goto :goto_15

    :cond_15
    move-object/from16 v48, p44

    :goto_15
    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_16

    move-object/from16 v49, v3

    goto :goto_16

    :cond_16
    move-object/from16 v49, p45

    :goto_16
    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_17

    move-object/from16 v50, v3

    goto :goto_17

    :cond_17
    move-object/from16 v50, p46

    :goto_17
    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_18

    move-object/from16 v51, v3

    goto :goto_18

    :cond_18
    move-object/from16 v51, p47

    :goto_18
    and-int v0, v1, v2

    if-eqz v0, :cond_19

    move-object/from16 v52, v3

    goto :goto_19

    :cond_19
    move-object/from16 v52, p48

    :goto_19
    const/high16 v0, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_1a

    move-object/from16 v55, v3

    goto :goto_1a

    :cond_1a
    move-object/from16 v55, p51

    :goto_1a
    const/high16 v0, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_1b

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v56, v0

    goto :goto_1b

    :cond_1b
    move-object/from16 v56, p52

    :goto_1b
    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v9, p5

    move/from16 v10, p6

    move/from16 v11, p7

    move/from16 v12, p8

    move/from16 v13, p9

    move/from16 v14, p10

    move/from16 v15, p11

    move/from16 v16, p12

    move-object/from16 v23, p19

    move/from16 v24, p20

    move-object/from16 v25, p21

    move/from16 v26, p22

    move-object/from16 v27, p23

    move/from16 v28, p24

    move-object/from16 v29, p25

    move-object/from16 v30, p26

    move/from16 v31, p27

    move-object/from16 v40, p36

    move-object/from16 v41, p37

    move-object/from16 v42, p38

    move/from16 v46, p42

    move-object/from16 v53, p49

    move-object/from16 v54, p50

    invoke-direct/range {v4 .. v56}, Lco/bird/android/model/persistence/Area;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/Area;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;IILjava/lang/Object;)Lco/bird/android/model/persistence/Area;
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p53

    move/from16 v2, p54

    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_0

    iget-object v3, v0, Lco/bird/android/model/persistence/Area;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-object v4, v0, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lco/bird/android/model/persistence/Area;->label:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, Lco/bird/android/model/persistence/Area;->notes:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-boolean v7, v0, Lco/bird/android/model/persistence/Area;->hideBirds:Z

    goto :goto_4

    :cond_4
    move/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-boolean v8, v0, Lco/bird/android/model/persistence/Area;->rejectDrops:Z

    goto :goto_5

    :cond_5
    move/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-boolean v9, v0, Lco/bird/android/model/persistence/Area;->noRides:Z

    goto :goto_6

    :cond_6
    move/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-boolean v10, v0, Lco/bird/android/model/persistence/Area;->noParking:Z

    goto :goto_7

    :cond_7
    move/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-boolean v11, v0, Lco/bird/android/model/persistence/Area;->preferredParking:Z

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, v0, Lco/bird/android/model/persistence/Area;->delivery:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    goto :goto_a

    :cond_a
    move/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, v0, Lco/bird/android/model/persistence/Area;->isDemandArea:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->feeModified:Ljava/lang/Boolean;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    move-object/from16 p13, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->demandLevel:Ljava/lang/Integer;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->overlayLabel:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    move-object/from16 p15, v15

    if-eqz v17, :cond_f

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->overlayIcon:Lco/bird/android/model/constant/AreaIconType;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, v1, v17

    move-object/from16 p16, v15

    if-eqz v18, :cond_10

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->overlayMinZoomLevel:Ljava/lang/Integer;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, v1, v18

    move-object/from16 p17, v15

    if-eqz v19, :cond_11

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->selectedOverlayLabel:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, v1, v19

    move-object/from16 p18, v15

    if-eqz v20, :cond_12

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->region:Lco/bird/android/model/Polygon;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, v1, v20

    move-object/from16 p19, v15

    if-eqz v21, :cond_13

    iget v15, v0, Lco/bird/android/model/persistence/Area;->color:I

    goto :goto_13

    :cond_13
    move/from16 v15, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v1, v21

    move/from16 p20, v15

    if-eqz v21, :cond_14

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->colorDark:Ljava/lang/Integer;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p21

    :goto_14
    const/high16 v21, 0x200000

    and-int v21, v1, v21

    move-object/from16 p21, v15

    if-eqz v21, :cond_15

    iget v15, v0, Lco/bird/android/model/persistence/Area;->borderColor:I

    goto :goto_15

    :cond_15
    move/from16 v15, p22

    :goto_15
    const/high16 v21, 0x400000

    and-int v21, v1, v21

    move/from16 p22, v15

    if-eqz v21, :cond_16

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->borderColorDark:Ljava/lang/Integer;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p23

    :goto_16
    const/high16 v21, 0x800000

    and-int v21, v1, v21

    move-object/from16 p23, v15

    if-eqz v21, :cond_17

    iget v15, v0, Lco/bird/android/model/persistence/Area;->titleColor:I

    goto :goto_17

    :cond_17
    move/from16 v15, p24

    :goto_17
    const/high16 v21, 0x1000000

    and-int v21, v1, v21

    move/from16 p24, v15

    if-eqz v21, :cond_18

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->titleColorDark:Ljava/lang/Integer;

    goto :goto_18

    :cond_18
    move-object/from16 v15, p25

    :goto_18
    const/high16 v21, 0x2000000

    and-int v21, v1, v21

    move-object/from16 p25, v15

    if-eqz v21, :cond_19

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->zoomBehavior:Lco/bird/android/model/constant/ZoomBehavior;

    goto :goto_19

    :cond_19
    move-object/from16 v15, p26

    :goto_19
    const/high16 v21, 0x4000000

    and-int v21, v1, v21

    move-object/from16 p26, v15

    if-eqz v21, :cond_1a

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Area;->operational:Z

    goto :goto_1a

    :cond_1a
    move/from16 v15, p27

    :goto_1a
    const/high16 v21, 0x8000000

    and-int v21, v1, v21

    move/from16 p27, v15

    if-eqz v21, :cond_1b

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->maxSpeed:Ljava/lang/Integer;

    goto :goto_1b

    :cond_1b
    move-object/from16 v15, p28

    :goto_1b
    const/high16 v21, 0x10000000

    and-int v21, v1, v21

    move-object/from16 p28, v15

    if-eqz v21, :cond_1c

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    goto :goto_1c

    :cond_1c
    move-object/from16 v15, p29

    :goto_1c
    const/high16 v21, 0x20000000

    and-int v21, v1, v21

    move-object/from16 p29, v15

    if-eqz v21, :cond_1d

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertTitle:Ljava/lang/String;

    goto :goto_1d

    :cond_1d
    move-object/from16 v15, p30

    :goto_1d
    const/high16 v21, 0x40000000    # 2.0f

    and-int v21, v1, v21

    move-object/from16 p30, v15

    if-eqz v21, :cond_1e

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertMessage:Ljava/lang/String;

    goto :goto_1e

    :cond_1e
    move-object/from16 v15, p31

    :goto_1e
    const/high16 v21, -0x80000000

    and-int v1, v1, v21

    if-eqz v1, :cond_1f

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageTitle:Ljava/lang/String;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v21, v2, 0x1

    move-object/from16 p32, v1

    if-eqz v21, :cond_20

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageBody:Ljava/lang/String;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p33

    :goto_20
    and-int/lit8 v21, v2, 0x2

    move-object/from16 p33, v1

    if-eqz v21, :cond_21

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p34

    :goto_21
    and-int/lit8 v21, v2, 0x4

    move-object/from16 p34, v1

    if-eqz v21, :cond_22

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageBody:Ljava/lang/String;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v21, v2, 0x8

    move-object/from16 p35, v1

    if-eqz v21, :cond_23

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v21, v2, 0x10

    move-object/from16 p36, v1

    if-eqz v21, :cond_24

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v21, v2, 0x20

    move-object/from16 p37, v1

    if-eqz v21, :cond_25

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->areaReleaseCapacityIconType:Lco/bird/android/model/constant/AreaIconType;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v21, v2, 0x40

    move-object/from16 p38, v1

    if-eqz v21, :cond_26

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->partnerId:Ljava/lang/String;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p39, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->fleetIds:Ljava/util/List;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p40, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->areaKeys:Ljava/util/List;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    move-object/from16 p41, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-boolean v1, v0, Lco/bird/android/model/persistence/Area;->isUniversalArea:Z

    goto :goto_29

    :cond_29
    move/from16 v1, p42

    :goto_29
    move/from16 p42, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingFineCurrency:Ljava/lang/String;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p43

    :goto_2a
    move-object/from16 p43, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertTitle:Ljava/lang/String;

    goto :goto_2b

    :cond_2b
    move-object/from16 v1, p44

    :goto_2b
    move-object/from16 p44, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertBody:Ljava/lang/String;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    move-object/from16 p45, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->noParkingFineAmount:Ljava/lang/Integer;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p46

    :goto_2d
    move-object/from16 p46, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->areasMerged:Ljava/util/List;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p47

    :goto_2e
    and-int v16, v2, v16

    move-object/from16 p47, v1

    if-eqz v16, :cond_2f

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->centerPoint:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    goto :goto_2f

    :cond_2f
    move-object/from16 v1, p48

    :goto_2f
    and-int v16, v2, v17

    move-object/from16 p48, v1

    if-eqz v16, :cond_30

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->role:Ljava/lang/String;

    goto :goto_30

    :cond_30
    move-object/from16 v1, p49

    :goto_30
    and-int v16, v2, v18

    move-object/from16 p49, v1

    if-eqz v16, :cond_31

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->updatedAt:Lorg/joda/time/DateTime;

    goto :goto_31

    :cond_31
    move-object/from16 v1, p50

    :goto_31
    and-int v16, v2, v19

    move-object/from16 p50, v1

    if-eqz v16, :cond_32

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->zoneId:Ljava/lang/String;

    goto :goto_32

    :cond_32
    move-object/from16 v1, p51

    :goto_32
    and-int v2, v2, v20

    if-eqz v2, :cond_33

    iget-object v2, v0, Lco/bird/android/model/persistence/Area;->walkway:Ljava/lang/Boolean;

    goto :goto_33

    :cond_33
    move-object/from16 v2, p52

    :goto_33
    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v5

    move-object/from16 p4, v6

    move/from16 p5, v7

    move/from16 p6, v8

    move/from16 p7, v9

    move/from16 p8, v10

    move/from16 p9, v11

    move/from16 p10, v12

    move/from16 p11, v13

    move/from16 p12, v14

    move-object/from16 p31, v15

    move-object/from16 p51, v1

    move-object/from16 p52, v2

    invoke-virtual/range {p0 .. p52}, Lco/bird/android/model/persistence/Area;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)Lco/bird/android/model/persistence/Area;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->delivery:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    return v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isDemandArea:Z

    return v0
.end method

.method public final component13()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->feeModified:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component14()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->demandLevel:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->overlayLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->overlayIcon:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final component17()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->overlayMinZoomLevel:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->selectedOverlayLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Lco/bird/android/model/Polygon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->region:Lco/bird/android/model/Polygon;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Area;->color:I

    return v0
.end method

.method public final component21()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->colorDark:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Area;->borderColor:I

    return v0
.end method

.method public final component23()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->borderColorDark:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Area;->titleColor:I

    return v0
.end method

.method public final component25()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->titleColorDark:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component26()Lco/bird/android/model/constant/ZoomBehavior;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->zoomBehavior:Lco/bird/android/model/constant/ZoomBehavior;

    return-object v0
.end method

.method public final component27()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->operational:Z

    return v0
.end method

.method public final component28()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->maxSpeed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component29()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component31()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component32()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component33()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component34()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component35()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component36()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final component37()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final component38()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->areaReleaseCapacityIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final component39()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final component40()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->fleetIds:Ljava/util/List;

    return-object v0
.end method

.method public final component41()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->areaKeys:Ljava/util/List;

    return-object v0
.end method

.method public final component42()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isUniversalArea:Z

    return v0
.end method

.method public final component43()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingFineCurrency:Ljava/lang/String;

    return-object v0
.end method

.method public final component44()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component45()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component46()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component47()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->areasMerged:Ljava/util/List;

    return-object v0
.end method

.method public final component48()Lco/bird/android/model/persistence/nestedstructures/Geolocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->centerPoint:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    return-object v0
.end method

.method public final component49()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->hideBirds:Z

    return v0
.end method

.method public final component50()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->updatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component51()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final component52()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->walkway:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->rejectDrops:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->noRides:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->noParking:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->preferredParking:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)Lco/bird/android/model/persistence/Area;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZZZZZZZ",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/Polygon;",
            "I",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/lang/Integer;",
            "Lco/bird/android/model/constant/ZoomBehavior;",
            "Z",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Lco/bird/android/model/constant/AreaIconType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ")",
            "Lco/bird/android/model/persistence/Area;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v21, p21

    move/from16 v22, p22

    move-object/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move/from16 v27, p27

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

    move/from16 v42, p42

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

    const-string v0, "id"

    move-object/from16 v53, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    move-object/from16 v1, p19

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoomBehavior"

    move-object/from16 v1, p26

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "riderBarInRideMessageIconType"

    move-object/from16 v1, p36

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "riderBarNotInRideMessageIconType"

    move-object/from16 v1, p37

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areaReleaseCapacityIconType"

    move-object/from16 v1, p38

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    move-object/from16 v1, p49

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updatedAt"

    move-object/from16 v1, p50

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v54, Lco/bird/android/model/persistence/Area;

    move-object/from16 v0, v54

    move-object/from16 v1, v53

    invoke-direct/range {v0 .. v52}, Lco/bird/android/model/persistence/Area;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v54
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/Area;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/Area;

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->label:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->notes:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->notes:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->hideBirds:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->hideBirds:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->rejectDrops:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->rejectDrops:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->noRides:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->noRides:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->noParking:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->noParking:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->preferredParking:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->preferredParking:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->delivery:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->delivery:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->isDemandArea:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->isDemandArea:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->feeModified:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->feeModified:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->demandLevel:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->demandLevel:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->overlayLabel:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->overlayLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->overlayIcon:Lco/bird/android/model/constant/AreaIconType;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->overlayIcon:Lco/bird/android/model/constant/AreaIconType;

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->overlayMinZoomLevel:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->overlayMinZoomLevel:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->selectedOverlayLabel:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->selectedOverlayLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->region:Lco/bird/android/model/Polygon;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->region:Lco/bird/android/model/Polygon;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lco/bird/android/model/persistence/Area;->color:I

    iget v3, p1, Lco/bird/android/model/persistence/Area;->color:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->colorDark:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->colorDark:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lco/bird/android/model/persistence/Area;->borderColor:I

    iget v3, p1, Lco/bird/android/model/persistence/Area;->borderColor:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->borderColorDark:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->borderColorDark:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lco/bird/android/model/persistence/Area;->titleColor:I

    iget v3, p1, Lco/bird/android/model/persistence/Area;->titleColor:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->titleColorDark:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->titleColorDark:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->zoomBehavior:Lco/bird/android/model/constant/ZoomBehavior;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->zoomBehavior:Lco/bird/android/model/constant/ZoomBehavior;

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->operational:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->operational:Z

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->maxSpeed:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->maxSpeed:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->noParkingFineAlertTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertMessage:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->noParkingFineAlertMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    return v2

    :cond_20
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_21

    return v2

    :cond_21
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageBody:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    return v2

    :cond_23
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageBody:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    if-eq v1, v3, :cond_25

    return v2

    :cond_25
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    if-eq v1, v3, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->areaReleaseCapacityIconType:Lco/bird/android/model/constant/AreaIconType;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->areaReleaseCapacityIconType:Lco/bird/android/model/constant/AreaIconType;

    if-eq v1, v3, :cond_27

    return v2

    :cond_27
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->partnerId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->partnerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    return v2

    :cond_28
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->fleetIds:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->fleetIds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    return v2

    :cond_29
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->areaKeys:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->areaKeys:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    return v2

    :cond_2a
    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->isUniversalArea:Z

    iget-boolean v3, p1, Lco/bird/android/model/persistence/Area;->isUniversalArea:Z

    if-eq v1, v3, :cond_2b

    return v2

    :cond_2b
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingFineCurrency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->noParkingFineCurrency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    return v2

    :cond_2c
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertTitle:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertBody:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    return v2

    :cond_2e
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAmount:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->noParkingFineAmount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    return v2

    :cond_2f
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->areasMerged:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->areasMerged:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->centerPoint:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->centerPoint:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    return v2

    :cond_31
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->role:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    return v2

    :cond_32
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->updatedAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->updatedAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    return v2

    :cond_33
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->zoneId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/Area;->zoneId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    return v2

    :cond_34
    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->walkway:Ljava/lang/Boolean;

    iget-object p1, p1, Lco/bird/android/model/persistence/Area;->walkway:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_35

    return v2

    :cond_35
    return v0
.end method

.method public final getAreaKeys()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->areaKeys:Ljava/util/List;

    return-object v0
.end method

.method public final getAreaReleaseCapacityIconType()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->areaReleaseCapacityIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final getAreasMerged()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->areasMerged:Ljava/util/List;

    return-object v0
.end method

.method public getBorderColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Area;->borderColor:I

    return v0
.end method

.method public final getBorderColorDark()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->borderColorDark:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCenterPoint()Lco/bird/android/model/persistence/nestedstructures/Geolocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->centerPoint:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    return-object v0
.end method

.method public getColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Area;->color:I

    return v0
.end method

.method public final getColorDark()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->colorDark:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getDelivery()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->delivery:Z

    return v0
.end method

.method public final getDemandLevel()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->demandLevel:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getFeeModified()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->feeModified:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getFleetIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->fleetIds:Ljava/util/List;

    return-object v0
.end method

.method public final getHideBirds()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->hideBirds:Z

    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getJtsRegion()LCX3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->jtsRegion$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCX3;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaxSpeed()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->maxSpeed:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNoParking()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->noParking:Z

    return v0
.end method

.method public final getNoParkingFineAlertMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getNoParkingFineAlertTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNoParkingFineAmount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAmount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNoParkingFineCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingFineCurrency:Ljava/lang/String;

    return-object v0
.end method

.method public final getNoParkingWarningAlertBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getNoParkingWarningAlertTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getNoRides()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->noRides:Z

    return v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->notes:Ljava/lang/String;

    return-object v0
.end method

.method public final getOperational()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->operational:Z

    return v0
.end method

.method public final getOverlayIcon()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->overlayIcon:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final getOverlayLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->overlayLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getOverlayMinZoomLevel()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->overlayMinZoomLevel:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getPartnerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreferredParking()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->preferredParking:Z

    return v0
.end method

.method public getRegion()Lco/bird/android/model/Polygon;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->region:Lco/bird/android/model/Polygon;

    return-object v0
.end method

.method public final getRejectDrops()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->rejectDrops:Z

    return v0
.end method

.method public final getReleaseCapacity()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRiderBarInRideMessageBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getRiderBarInRideMessageIconType()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final getRiderBarInRideMessageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getRiderBarNotInRideMessageBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getRiderBarNotInRideMessageIconType()Lco/bird/android/model/constant/AreaIconType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    return-object v0
.end method

.method public final getRiderBarNotInRideMessageTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedOverlayLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->selectedOverlayLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/persistence/Area;->titleColor:I

    return v0
.end method

.method public final getTitleColorDark()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->titleColorDark:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getUpdatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->updatedAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getWalkway()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->walkway:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public getZoomBehavior()Lco/bird/android/model/constant/ZoomBehavior;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->zoomBehavior:Lco/bird/android/model/constant/ZoomBehavior;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->label:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->notes:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->hideBirds:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    move v1, v3

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->rejectDrops:Z

    if-eqz v1, :cond_4

    move v1, v3

    :cond_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->noRides:Z

    if-eqz v1, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->noParking:Z

    if-eqz v1, :cond_6

    move v1, v3

    :cond_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->preferredParking:Z

    if-eqz v1, :cond_7

    move v1, v3

    :cond_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->delivery:Z

    if-eqz v1, :cond_8

    move v1, v3

    :cond_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    if-eqz v1, :cond_9

    move v1, v3

    :cond_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->isDemandArea:Z

    if-eqz v1, :cond_a

    move v1, v3

    :cond_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->feeModified:Ljava/lang/Boolean;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_3

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->demandLevel:Ljava/lang/Integer;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_4

    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->overlayLabel:Ljava/lang/String;

    if-nez v1, :cond_d

    move v1, v2

    goto :goto_5

    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->overlayIcon:Lco/bird/android/model/constant/AreaIconType;

    if-nez v1, :cond_e

    move v1, v2

    goto :goto_6

    :cond_e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->overlayMinZoomLevel:Ljava/lang/Integer;

    if-nez v1, :cond_f

    move v1, v2

    goto :goto_7

    :cond_f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->selectedOverlayLabel:Ljava/lang/String;

    if-nez v1, :cond_10

    move v1, v2

    goto :goto_8

    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->region:Lco/bird/android/model/Polygon;

    invoke-virtual {v1}, Lco/bird/android/model/ComposedGeom;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/persistence/Area;->color:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->colorDark:Ljava/lang/Integer;

    if-nez v1, :cond_11

    move v1, v2

    goto :goto_9

    :cond_11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/persistence/Area;->borderColor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->borderColorDark:Ljava/lang/Integer;

    if-nez v1, :cond_12

    move v1, v2

    goto :goto_a

    :cond_12
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/persistence/Area;->titleColor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->titleColorDark:Ljava/lang/Integer;

    if-nez v1, :cond_13

    move v1, v2

    goto :goto_b

    :cond_13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->zoomBehavior:Lco/bird/android/model/constant/ZoomBehavior;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->operational:Z

    if-eqz v1, :cond_14

    move v1, v3

    :cond_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->maxSpeed:Ljava/lang/Integer;

    if-nez v1, :cond_15

    move v1, v2

    goto :goto_c

    :cond_15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    if-nez v1, :cond_16

    move v1, v2

    goto :goto_d

    :cond_16
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertTitle:Ljava/lang/String;

    if-nez v1, :cond_17

    move v1, v2

    goto :goto_e

    :cond_17
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertMessage:Ljava/lang/String;

    if-nez v1, :cond_18

    move v1, v2

    goto :goto_f

    :cond_18
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_f
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageTitle:Ljava/lang/String;

    if-nez v1, :cond_19

    move v1, v2

    goto :goto_10

    :cond_19
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_10
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageBody:Ljava/lang/String;

    if-nez v1, :cond_1a

    move v1, v2

    goto :goto_11

    :cond_1a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_11
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    if-nez v1, :cond_1b

    move v1, v2

    goto :goto_12

    :cond_1b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageBody:Ljava/lang/String;

    if-nez v1, :cond_1c

    move v1, v2

    goto :goto_13

    :cond_1c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->areaReleaseCapacityIconType:Lco/bird/android/model/constant/AreaIconType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->partnerId:Ljava/lang/String;

    if-nez v1, :cond_1d

    move v1, v2

    goto :goto_14

    :cond_1d
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->fleetIds:Ljava/util/List;

    if-nez v1, :cond_1e

    move v1, v2

    goto :goto_15

    :cond_1e
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_15
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->areaKeys:Ljava/util/List;

    if-nez v1, :cond_1f

    move v1, v2

    goto :goto_16

    :cond_1f
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_16
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/persistence/Area;->isUniversalArea:Z

    if-eqz v1, :cond_20

    goto :goto_17

    :cond_20
    move v3, v1

    :goto_17
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingFineCurrency:Ljava/lang/String;

    if-nez v1, :cond_21

    move v1, v2

    goto :goto_18

    :cond_21
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_18
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertTitle:Ljava/lang/String;

    if-nez v1, :cond_22

    move v1, v2

    goto :goto_19

    :cond_22
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_19
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertBody:Ljava/lang/String;

    if-nez v1, :cond_23

    move v1, v2

    goto :goto_1a

    :cond_23
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->noParkingFineAmount:Ljava/lang/Integer;

    if-nez v1, :cond_24

    move v1, v2

    goto :goto_1b

    :cond_24
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->areasMerged:Ljava/util/List;

    if-nez v1, :cond_25

    move v1, v2

    goto :goto_1c

    :cond_25
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1c
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->centerPoint:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    if-nez v1, :cond_26

    move v1, v2

    goto :goto_1d

    :cond_26
    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->hashCode()I

    move-result v1

    :goto_1d
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->role:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->updatedAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->zoneId:Ljava/lang/String;

    if-nez v1, :cond_27

    move v1, v2

    goto :goto_1e

    :cond_27
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1e
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/Area;->walkway:Ljava/lang/Boolean;

    if-nez v1, :cond_28

    goto :goto_1f

    :cond_28
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1f
    add-int/2addr v0, v2

    return v0
.end method

.method public final isDemandArea()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isDemandArea:Z

    return v0
.end method

.method public final isOperationalInverse()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isOperationalInverse:Z

    return v0
.end method

.method public final isReleaseConstrained()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    return v0
.end method

.method public final isUniversalArea()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isUniversalArea:Z

    return v0
.end method

.method public final popupInvocationMethod()Lco/bird/android/model/constant/PopupInvocationMethod;
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    sget-object v0, Lco/bird/android/model/constant/PopupInvocationMethod;->MAP_MARKER:Lco/bird/android/model/constant/PopupInvocationMethod;

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/model/constant/PopupInvocationMethod;->POLYGON_TAP:Lco/bird/android/model/constant/PopupInvocationMethod;

    :goto_0
    return-object v0
.end method

.method public final popupType()Lco/bird/android/model/constant/PopupType;
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    if-eqz v0, :cond_0

    sget-object v0, Lco/bird/android/model/constant/PopupType;->BOTTOM_SHEET:Lco/bird/android/model/constant/PopupType;

    goto :goto_0

    :cond_0
    sget-object v0, Lco/bird/android/model/constant/PopupType;->INFO_WINDOW:Lco/bird/android/model/constant/PopupType;

    :goto_0
    return-object v0
.end method

.method public final setOperationalInverse(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/model/persistence/Area;->isOperationalInverse:Z

    return-void
.end method

.method public final title()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->label:Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 54

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/persistence/Area;->id:Ljava/lang/String;

    iget-object v2, v0, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    iget-object v3, v0, Lco/bird/android/model/persistence/Area;->label:Ljava/lang/String;

    iget-object v4, v0, Lco/bird/android/model/persistence/Area;->notes:Ljava/lang/String;

    iget-boolean v5, v0, Lco/bird/android/model/persistence/Area;->hideBirds:Z

    iget-boolean v6, v0, Lco/bird/android/model/persistence/Area;->rejectDrops:Z

    iget-boolean v7, v0, Lco/bird/android/model/persistence/Area;->noRides:Z

    iget-boolean v8, v0, Lco/bird/android/model/persistence/Area;->noParking:Z

    iget-boolean v9, v0, Lco/bird/android/model/persistence/Area;->preferredParking:Z

    iget-boolean v10, v0, Lco/bird/android/model/persistence/Area;->delivery:Z

    iget-boolean v11, v0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    iget-boolean v12, v0, Lco/bird/android/model/persistence/Area;->isDemandArea:Z

    iget-object v13, v0, Lco/bird/android/model/persistence/Area;->feeModified:Ljava/lang/Boolean;

    iget-object v14, v0, Lco/bird/android/model/persistence/Area;->demandLevel:Ljava/lang/Integer;

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->overlayLabel:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->overlayIcon:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->overlayMinZoomLevel:Ljava/lang/Integer;

    move-object/from16 v18, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->selectedOverlayLabel:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->region:Lco/bird/android/model/Polygon;

    move-object/from16 v20, v15

    iget v15, v0, Lco/bird/android/model/persistence/Area;->color:I

    move/from16 v21, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->colorDark:Ljava/lang/Integer;

    move-object/from16 v22, v15

    iget v15, v0, Lco/bird/android/model/persistence/Area;->borderColor:I

    move/from16 v23, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->borderColorDark:Ljava/lang/Integer;

    move-object/from16 v24, v15

    iget v15, v0, Lco/bird/android/model/persistence/Area;->titleColor:I

    move/from16 v25, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->titleColorDark:Ljava/lang/Integer;

    move-object/from16 v26, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->zoomBehavior:Lco/bird/android/model/constant/ZoomBehavior;

    move-object/from16 v27, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Area;->operational:Z

    move/from16 v28, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->maxSpeed:Ljava/lang/Integer;

    move-object/from16 v29, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    move-object/from16 v30, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertTitle:Ljava/lang/String;

    move-object/from16 v31, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->noParkingFineAlertMessage:Ljava/lang/String;

    move-object/from16 v32, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageTitle:Ljava/lang/String;

    move-object/from16 v33, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageBody:Ljava/lang/String;

    move-object/from16 v34, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageTitle:Ljava/lang/String;

    move-object/from16 v35, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageBody:Ljava/lang/String;

    move-object/from16 v36, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->riderBarInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v37, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->riderBarNotInRideMessageIconType:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v38, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->areaReleaseCapacityIconType:Lco/bird/android/model/constant/AreaIconType;

    move-object/from16 v39, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->partnerId:Ljava/lang/String;

    move-object/from16 v40, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->fleetIds:Ljava/util/List;

    move-object/from16 v41, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->areaKeys:Ljava/util/List;

    move-object/from16 v42, v15

    iget-boolean v15, v0, Lco/bird/android/model/persistence/Area;->isUniversalArea:Z

    move/from16 v43, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->noParkingFineCurrency:Ljava/lang/String;

    move-object/from16 v44, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertTitle:Ljava/lang/String;

    move-object/from16 v45, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->noParkingWarningAlertBody:Ljava/lang/String;

    move-object/from16 v46, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->noParkingFineAmount:Ljava/lang/Integer;

    move-object/from16 v47, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->areasMerged:Ljava/util/List;

    move-object/from16 v48, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->centerPoint:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-object/from16 v49, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->role:Ljava/lang/String;

    move-object/from16 v50, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->updatedAt:Lorg/joda/time/DateTime;

    move-object/from16 v51, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->zoneId:Ljava/lang/String;

    move-object/from16 v52, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/Area;->walkway:Ljava/lang/Boolean;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v53, v15

    const-string v15, "Area(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", notes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hideBirds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", rejectDrops="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", noRides="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", noParking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", preferredParking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", delivery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isReleaseConstrained="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isDemandArea="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", feeModified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", demandLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", overlayLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", overlayIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", overlayMinZoomLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedOverlayLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", region="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", colorDark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", borderColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", borderColorDark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", titleColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", titleColorDark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", zoomBehavior="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", operational="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", releaseCapacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingFineAlertTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingFineAlertMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarInRideMessageTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarInRideMessageBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarNotInRideMessageTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarNotInRideMessageBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarInRideMessageIconType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", riderBarNotInRideMessageIconType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v38

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", areaReleaseCapacityIconType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v39

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", partnerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fleetIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v41

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", areaKeys="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v42

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isUniversalArea="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingFineCurrency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingWarningAlertTitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v45

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingWarningAlertBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v46

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", noParkingFineAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v47

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", areasMerged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v48

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", centerPoint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v49

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v50

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v51

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", zoneId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v52

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", walkway="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v53

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toolTipTitle()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/persistence/Area;->isReleaseConstrained:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->releaseCapacity:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lco/bird/android/model/persistence/Area;->title:Ljava/lang/String;

    :goto_0
    return-object v0
.end method
