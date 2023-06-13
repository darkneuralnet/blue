.class public final Lcom/stripe/android/model/Source;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;
.implements Lcom/stripe/android/model/StripePaymentSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/Source$CodeVerification;,
        Lcom/stripe/android/model/Source$Flow;,
        Lcom/stripe/android/model/Source$Owner;,
        Lcom/stripe/android/model/Source$Receiver;,
        Lcom/stripe/android/model/Source$Redirect;,
        Lcom/stripe/android/model/Source$Status;,
        Lcom/stripe/android/model/Source$Usage;,
        Lcom/stripe/android/model/Source$Klarna;,
        Lcom/stripe/android/model/Source$Companion;,
        Lcom/stripe/android/model/Source$SourceType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008@\u0008\u0087\u0008\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u0002:\u0014\u0081\u0001\u0080\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B\u0089\u0002\u0008\u0000\u0012\u0008\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u001c\u0012\u0018\u0008\u0002\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001e\u0012\n\u0008\u0002\u00107\u001a\u0004\u0018\u00010!\u0012\u0006\u00108\u001a\u00020\u0007\u0012\u0006\u00109\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010%\u0012\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010\'\u0012\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c2\u0003J\u000b\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010!H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010%H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\'H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0096\u0002\u0010?\u001a\u00020\u00002\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u00101\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\u0018\u0008\u0002\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001e2\n\u0008\u0002\u00107\u001a\u0004\u0018\u00010!2\u0008\u0008\u0002\u00108\u001a\u00020\u00072\u0008\u0008\u0002\u00109\u001a\u00020\u00072\n\u0008\u0002\u0010:\u001a\u0004\u0018\u00010%2\n\u0008\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010<\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010\'2\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008?\u0010@J\t\u0010A\u001a\u00020\u0007H\u00d6\u0001J\t\u0010C\u001a\u00020BH\u00d6\u0001J\u0013\u0010E\u001a\u00020\u00132\u0008\u0010D\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010F\u001a\u00020BH\u00d6\u0001J\u0019\u0010K\u001a\u00020J2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020BH\u00d6\u0001R\u001c\u0010*\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008*\u0010L\u001a\u0004\u0008M\u0010NR\u0019\u0010+\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010O\u001a\u0004\u0008P\u0010\u000bR\u0019\u0010,\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010L\u001a\u0004\u0008Q\u0010NR\u0019\u0010-\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010R\u001a\u0004\u0008S\u0010TR\u0019\u0010.\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010O\u001a\u0004\u0008U\u0010\u000bR\u0019\u0010/\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u0010L\u001a\u0004\u0008V\u0010NR\u0019\u00100\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u00080\u0010W\u001a\u0004\u0008X\u0010YR\u0019\u00101\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010Z\u001a\u0004\u00081\u0010\u0015R\u0019\u00102\u001a\u0004\u0018\u00010\u00168\u0006\u00a2\u0006\u000c\n\u0004\u00082\u0010[\u001a\u0004\u0008\\\u0010]R\u0019\u00103\u001a\u0004\u0018\u00010\u00188\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010^\u001a\u0004\u0008_\u0010`R\u0019\u00104\u001a\u0004\u0018\u00010\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010a\u001a\u0004\u0008b\u0010cR\u0019\u00105\u001a\u0004\u0018\u00010\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u00085\u0010d\u001a\u0004\u0008e\u0010fR\'\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001e8\u0006\u00a2\u0006\u000c\n\u0004\u00086\u0010g\u001a\u0004\u0008h\u0010iR\u0019\u00107\u001a\u0004\u0018\u00010!8\u0006\u00a2\u0006\u000c\n\u0004\u00087\u0010j\u001a\u0004\u0008k\u0010lR\u0017\u00108\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u00088\u0010L\u001a\u0004\u0008m\u0010NR\u0017\u00109\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u00089\u0010L\u001a\u0004\u0008n\u0010NR\u0019\u0010:\u001a\u0004\u0018\u00010%8\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010o\u001a\u0004\u0008p\u0010qR\u0016\u0010;\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010rR\u0016\u0010<\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010sR\u0019\u0010=\u001a\u0004\u0018\u00010\'8\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010t\u001a\u0004\u0008u\u0010vR\u0019\u0010>\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u0010L\u001a\u0004\u0008w\u0010NR\u0011\u0010z\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008x\u0010yR\u0011\u0010}\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008{\u0010|\u00a8\u0006\u008a\u0001"
    }
    d2 = {
        "Lcom/stripe/android/model/Source;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "Lcom/stripe/android/model/StripePaymentSource;",
        "Lcom/stripe/android/model/WeChat;",
        "component18",
        "Lcom/stripe/android/model/Source$Klarna;",
        "component19",
        "",
        "component1",
        "",
        "component2",
        "()Ljava/lang/Long;",
        "component3",
        "Lcom/stripe/android/model/Source$CodeVerification;",
        "component4",
        "component5",
        "component6",
        "Lcom/stripe/android/model/Source$Flow;",
        "component7",
        "",
        "component8",
        "()Ljava/lang/Boolean;",
        "Lcom/stripe/android/model/Source$Owner;",
        "component9",
        "Lcom/stripe/android/model/Source$Receiver;",
        "component10",
        "Lcom/stripe/android/model/Source$Redirect;",
        "component11",
        "Lcom/stripe/android/model/Source$Status;",
        "component12",
        "",
        "",
        "component13",
        "Lcom/stripe/android/model/SourceTypeModel;",
        "component14",
        "component15",
        "component16",
        "Lcom/stripe/android/model/Source$Usage;",
        "component17",
        "Lcom/stripe/android/model/SourceOrder;",
        "component20",
        "component21",
        "id",
        "amount",
        "clientSecret",
        "codeVerification",
        "created",
        "currency",
        "flow",
        "isLiveMode",
        "owner",
        "receiver",
        "redirect",
        "status",
        "sourceTypeData",
        "sourceTypeModel",
        "type",
        "typeRaw",
        "usage",
        "_weChat",
        "_klarna",
        "sourceOrder",
        "statementDescriptor",
        "copy",
        "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)Lcom/stripe/android/model/Source;",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "",
        "writeToParcel",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "Ljava/lang/Long;",
        "getAmount",
        "getClientSecret",
        "Lcom/stripe/android/model/Source$CodeVerification;",
        "getCodeVerification",
        "()Lcom/stripe/android/model/Source$CodeVerification;",
        "getCreated",
        "getCurrency",
        "Lcom/stripe/android/model/Source$Flow;",
        "getFlow",
        "()Lcom/stripe/android/model/Source$Flow;",
        "Ljava/lang/Boolean;",
        "Lcom/stripe/android/model/Source$Owner;",
        "getOwner",
        "()Lcom/stripe/android/model/Source$Owner;",
        "Lcom/stripe/android/model/Source$Receiver;",
        "getReceiver",
        "()Lcom/stripe/android/model/Source$Receiver;",
        "Lcom/stripe/android/model/Source$Redirect;",
        "getRedirect",
        "()Lcom/stripe/android/model/Source$Redirect;",
        "Lcom/stripe/android/model/Source$Status;",
        "getStatus",
        "()Lcom/stripe/android/model/Source$Status;",
        "Ljava/util/Map;",
        "getSourceTypeData",
        "()Ljava/util/Map;",
        "Lcom/stripe/android/model/SourceTypeModel;",
        "getSourceTypeModel",
        "()Lcom/stripe/android/model/SourceTypeModel;",
        "getType",
        "getTypeRaw",
        "Lcom/stripe/android/model/Source$Usage;",
        "getUsage",
        "()Lcom/stripe/android/model/Source$Usage;",
        "Lcom/stripe/android/model/WeChat;",
        "Lcom/stripe/android/model/Source$Klarna;",
        "Lcom/stripe/android/model/SourceOrder;",
        "getSourceOrder",
        "()Lcom/stripe/android/model/SourceOrder;",
        "getStatementDescriptor",
        "getWeChat",
        "()Lcom/stripe/android/model/WeChat;",
        "weChat",
        "getKlarna",
        "()Lcom/stripe/android/model/Source$Klarna;",
        "klarna",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V",
        "Companion",
        "CodeVerification",
        "Flow",
        "Klarna",
        "Owner",
        "Receiver",
        "Redirect",
        "SourceType",
        "Status",
        "Usage",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/Source;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/Source$Companion;

.field public static final EURO:Ljava/lang/String; = "eur"

.field public static final USD:Ljava/lang/String; = "usd"


# instance fields
.field private final _klarna:Lcom/stripe/android/model/Source$Klarna;

.field private final _weChat:Lcom/stripe/android/model/WeChat;

.field private final amount:Ljava/lang/Long;

.field private final clientSecret:Ljava/lang/String;

.field private final codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

.field private final created:Ljava/lang/Long;

.field private final currency:Ljava/lang/String;

.field private final flow:Lcom/stripe/android/model/Source$Flow;

.field private final id:Ljava/lang/String;

.field private final isLiveMode:Ljava/lang/Boolean;

.field private final owner:Lcom/stripe/android/model/Source$Owner;

.field private final receiver:Lcom/stripe/android/model/Source$Receiver;

.field private final redirect:Lcom/stripe/android/model/Source$Redirect;

.field private final sourceOrder:Lcom/stripe/android/model/SourceOrder;

.field private final sourceTypeData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

.field private final statementDescriptor:Ljava/lang/String;

.field private final status:Lcom/stripe/android/model/Source$Status;

.field private final type:Ljava/lang/String;

.field private final typeRaw:Ljava/lang/String;

.field private final usage:Lcom/stripe/android/model/Source$Usage;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/Source$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/Source$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/Source;->Companion:Lcom/stripe/android/model/Source$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/Source;->$stable:I

    new-instance v0, Lcom/stripe/android/model/Source$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/Source$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/Source;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/Source$CodeVerification;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/Source$Flow;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/model/Source$Owner;",
            "Lcom/stripe/android/model/Source$Receiver;",
            "Lcom/stripe/android/model/Source$Redirect;",
            "Lcom/stripe/android/model/Source$Status;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/model/SourceTypeModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/Source$Usage;",
            "Lcom/stripe/android/model/WeChat;",
            "Lcom/stripe/android/model/Source$Klarna;",
            "Lcom/stripe/android/model/SourceOrder;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p15

    move-object/from16 v2, p16

    const-string v3, "type"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "typeRaw"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v3, p1

    iput-object v3, v0, Lcom/stripe/android/model/Source;->id:Ljava/lang/String;

    move-object v3, p2

    iput-object v3, v0, Lcom/stripe/android/model/Source;->amount:Ljava/lang/Long;

    move-object v3, p3

    iput-object v3, v0, Lcom/stripe/android/model/Source;->clientSecret:Ljava/lang/String;

    move-object v3, p4

    iput-object v3, v0, Lcom/stripe/android/model/Source;->codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

    move-object v3, p5

    iput-object v3, v0, Lcom/stripe/android/model/Source;->created:Ljava/lang/Long;

    move-object v3, p6

    iput-object v3, v0, Lcom/stripe/android/model/Source;->currency:Ljava/lang/String;

    move-object v3, p7

    iput-object v3, v0, Lcom/stripe/android/model/Source;->flow:Lcom/stripe/android/model/Source$Flow;

    move-object v3, p8

    iput-object v3, v0, Lcom/stripe/android/model/Source;->isLiveMode:Ljava/lang/Boolean;

    move-object v3, p9

    iput-object v3, v0, Lcom/stripe/android/model/Source;->owner:Lcom/stripe/android/model/Source$Owner;

    move-object v3, p10

    iput-object v3, v0, Lcom/stripe/android/model/Source;->receiver:Lcom/stripe/android/model/Source$Receiver;

    move-object v3, p11

    iput-object v3, v0, Lcom/stripe/android/model/Source;->redirect:Lcom/stripe/android/model/Source$Redirect;

    move-object/from16 v3, p12

    iput-object v3, v0, Lcom/stripe/android/model/Source;->status:Lcom/stripe/android/model/Source$Status;

    move-object/from16 v3, p13

    iput-object v3, v0, Lcom/stripe/android/model/Source;->sourceTypeData:Ljava/util/Map;

    move-object/from16 v3, p14

    iput-object v3, v0, Lcom/stripe/android/model/Source;->sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

    iput-object v1, v0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    iput-object v2, v0, Lcom/stripe/android/model/Source;->typeRaw:Ljava/lang/String;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/stripe/android/model/Source;->usage:Lcom/stripe/android/model/Source$Usage;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/stripe/android/model/Source;->_weChat:Lcom/stripe/android/model/WeChat;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/stripe/android/model/Source;->_klarna:Lcom/stripe/android/model/Source$Klarna;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/stripe/android/model/Source;->sourceOrder:Lcom/stripe/android/model/SourceOrder;

    move-object/from16 v1, p21

    iput-object v1, v0, Lcom/stripe/android/model/Source;->statementDescriptor:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p22

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    move-object v9, v2

    goto :goto_4

    :cond_4
    move-object/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    move-object v10, v2

    goto :goto_5

    :cond_5
    move-object/from16 v10, p7

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object/from16 v11, p8

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    move-object v12, v2

    goto :goto_7

    :cond_7
    move-object/from16 v12, p9

    :goto_7
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_8

    move-object v13, v2

    goto :goto_8

    :cond_8
    move-object/from16 v13, p10

    :goto_8
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_9

    move-object v14, v2

    goto :goto_9

    :cond_9
    move-object/from16 v14, p11

    :goto_9
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_a

    move-object v15, v2

    goto :goto_a

    :cond_a
    move-object/from16 v15, p12

    :goto_a
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_b

    move-object/from16 v16, v2

    goto :goto_b

    :cond_b
    move-object/from16 v16, p13

    :goto_b
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_c

    move-object/from16 v17, v2

    goto :goto_c

    :cond_c
    move-object/from16 v17, p14

    :goto_c
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v20, v2

    goto :goto_d

    :cond_d
    move-object/from16 v20, p17

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v21, v2

    goto :goto_e

    :cond_e
    move-object/from16 v21, p18

    :goto_e
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v22, v2

    goto :goto_f

    :cond_f
    move-object/from16 v22, p19

    :goto_f
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v23, v2

    goto :goto_10

    :cond_10
    move-object/from16 v23, p20

    :goto_10
    const/high16 v1, 0x100000

    and-int/2addr v0, v1

    if-eqz v0, :cond_11

    move-object/from16 v24, v2

    goto :goto_11

    :cond_11
    move-object/from16 v24, p21

    :goto_11
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v18, p15

    move-object/from16 v19, p16

    invoke-direct/range {v3 .. v24}, Lcom/stripe/android/model/Source;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V

    return-void
.end method

.method public static final asSourceType(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/Source;->Companion:Lcom/stripe/android/model/Source$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/model/Source$Companion;->asSourceType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final component18()Lcom/stripe/android/model/WeChat;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->_weChat:Lcom/stripe/android/model/WeChat;

    return-object v0
.end method

.method private final component19()Lcom/stripe/android/model/Source$Klarna;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->_klarna:Lcom/stripe/android/model/Source$Klarna;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/Source;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/Source;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/model/Source;->amount:Ljava/lang/Long;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/model/Source;->clientSecret:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/model/Source;->codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/model/Source;->created:Ljava/lang/Long;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/model/Source;->currency:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/model/Source;->flow:Lcom/stripe/android/model/Source$Flow;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/model/Source;->isLiveMode:Ljava/lang/Boolean;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/model/Source;->owner:Lcom/stripe/android/model/Source$Owner;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/model/Source;->receiver:Lcom/stripe/android/model/Source$Receiver;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/stripe/android/model/Source;->redirect:Lcom/stripe/android/model/Source$Redirect;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/android/model/Source;->status:Lcom/stripe/android/model/Source$Status;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/stripe/android/model/Source;->sourceTypeData:Ljava/util/Map;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/stripe/android/model/Source;->sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p15, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lcom/stripe/android/model/Source;->typeRaw:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lcom/stripe/android/model/Source;->usage:Lcom/stripe/android/model/Source$Usage;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lcom/stripe/android/model/Source;->_weChat:Lcom/stripe/android/model/WeChat;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lcom/stripe/android/model/Source;->_klarna:Lcom/stripe/android/model/Source$Klarna;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lcom/stripe/android/model/Source;->sourceOrder:Lcom/stripe/android/model/SourceOrder;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v1, v1, v16

    if-eqz v1, :cond_14

    iget-object v1, v0, Lcom/stripe/android/model/Source;->statementDescriptor:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p20, v15

    move-object/from16 p21, v1

    invoke-virtual/range {p0 .. p21}, Lcom/stripe/android/model/Source;->copy(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)Lcom/stripe/android/model/Source;

    move-result-object v0

    return-object v0
.end method

.method public static final fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/Source;->Companion:Lcom/stripe/android/model/Source$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/model/Source$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/model/Source$Receiver;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->receiver:Lcom/stripe/android/model/Source$Receiver;

    return-object v0
.end method

.method public final component11()Lcom/stripe/android/model/Source$Redirect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->redirect:Lcom/stripe/android/model/Source$Redirect;

    return-object v0
.end method

.method public final component12()Lcom/stripe/android/model/Source$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->status:Lcom/stripe/android/model/Source$Status;

    return-object v0
.end method

.method public final component13()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/Source;->sourceTypeData:Ljava/util/Map;

    return-object v0
.end method

.method public final component14()Lcom/stripe/android/model/SourceTypeModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->typeRaw:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Lcom/stripe/android/model/Source$Usage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->usage:Lcom/stripe/android/model/Source$Usage;

    return-object v0
.end method

.method public final component2()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->amount:Ljava/lang/Long;

    return-object v0
.end method

.method public final component20()Lcom/stripe/android/model/SourceOrder;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->sourceOrder:Lcom/stripe/android/model/SourceOrder;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->statementDescriptor:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/model/Source$CodeVerification;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

    return-object v0
.end method

.method public final component5()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->created:Ljava/lang/Long;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/model/Source$Flow;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->flow:Lcom/stripe/android/model/Source$Flow;

    return-object v0
.end method

.method public final component8()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->isLiveMode:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/model/Source$Owner;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->owner:Lcom/stripe/android/model/Source$Owner;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)Lcom/stripe/android/model/Source;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/Source$CodeVerification;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/Source$Flow;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/model/Source$Owner;",
            "Lcom/stripe/android/model/Source$Receiver;",
            "Lcom/stripe/android/model/Source$Redirect;",
            "Lcom/stripe/android/model/Source$Status;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/stripe/android/model/SourceTypeModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/Source$Usage;",
            "Lcom/stripe/android/model/WeChat;",
            "Lcom/stripe/android/model/Source$Klarna;",
            "Lcom/stripe/android/model/SourceOrder;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/model/Source;"
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

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    const-string v0, "type"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeRaw"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v22, Lcom/stripe/android/model/Source;

    move-object/from16 v0, v22

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v21}, Lcom/stripe/android/model/Source;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$CodeVerification;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/Source$Flow;Ljava/lang/Boolean;Lcom/stripe/android/model/Source$Owner;Lcom/stripe/android/model/Source$Receiver;Lcom/stripe/android/model/Source$Redirect;Lcom/stripe/android/model/Source$Status;Ljava/util/Map;Lcom/stripe/android/model/SourceTypeModel;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Source$Usage;Lcom/stripe/android/model/WeChat;Lcom/stripe/android/model/Source$Klarna;Lcom/stripe/android/model/SourceOrder;Ljava/lang/String;)V

    return-object v22
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
    instance-of v1, p1, Lcom/stripe/android/model/Source;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/Source;

    invoke-virtual {p0}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/Source;->amount:Ljava/lang/Long;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->amount:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/Source;->clientSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->clientSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/Source;->codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/Source;->created:Ljava/lang/Long;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->created:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/model/Source;->currency:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/model/Source;->flow:Lcom/stripe/android/model/Source$Flow;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->flow:Lcom/stripe/android/model/Source$Flow;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/model/Source;->isLiveMode:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->isLiveMode:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/model/Source;->owner:Lcom/stripe/android/model/Source$Owner;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->owner:Lcom/stripe/android/model/Source$Owner;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/model/Source;->receiver:Lcom/stripe/android/model/Source$Receiver;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->receiver:Lcom/stripe/android/model/Source$Receiver;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/model/Source;->redirect:Lcom/stripe/android/model/Source$Redirect;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->redirect:Lcom/stripe/android/model/Source$Redirect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/model/Source;->status:Lcom/stripe/android/model/Source$Status;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->status:Lcom/stripe/android/model/Source$Status;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/model/Source;->sourceTypeData:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->sourceTypeData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/model/Source;->sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/stripe/android/model/Source;->typeRaw:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->typeRaw:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/stripe/android/model/Source;->usage:Lcom/stripe/android/model/Source$Usage;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->usage:Lcom/stripe/android/model/Source$Usage;

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/stripe/android/model/Source;->_weChat:Lcom/stripe/android/model/WeChat;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->_weChat:Lcom/stripe/android/model/WeChat;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/stripe/android/model/Source;->_klarna:Lcom/stripe/android/model/Source$Klarna;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->_klarna:Lcom/stripe/android/model/Source$Klarna;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/stripe/android/model/Source;->sourceOrder:Lcom/stripe/android/model/SourceOrder;

    iget-object v3, p1, Lcom/stripe/android/model/Source;->sourceOrder:Lcom/stripe/android/model/SourceOrder;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/stripe/android/model/Source;->statementDescriptor:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/model/Source;->statementDescriptor:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    return v2

    :cond_16
    return v0
.end method

.method public final getAmount()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->amount:Ljava/lang/Long;

    return-object v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getCodeVerification()Lcom/stripe/android/model/Source$CodeVerification;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

    return-object v0
.end method

.method public final getCreated()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->created:Ljava/lang/Long;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getFlow()Lcom/stripe/android/model/Source$Flow;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->flow:Lcom/stripe/android/model/Source$Flow;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getKlarna()Lcom/stripe/android/model/Source$Klarna;
    .locals 2

    const-string v0, "klarna"

    iget-object v1, p0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->_klarna:Lcom/stripe/android/model/Source$Klarna;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Source type must be \'klarna\'"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getOwner()Lcom/stripe/android/model/Source$Owner;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->owner:Lcom/stripe/android/model/Source$Owner;

    return-object v0
.end method

.method public final getReceiver()Lcom/stripe/android/model/Source$Receiver;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->receiver:Lcom/stripe/android/model/Source$Receiver;

    return-object v0
.end method

.method public final getRedirect()Lcom/stripe/android/model/Source$Redirect;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->redirect:Lcom/stripe/android/model/Source$Redirect;

    return-object v0
.end method

.method public final getSourceOrder()Lcom/stripe/android/model/SourceOrder;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->sourceOrder:Lcom/stripe/android/model/SourceOrder;

    return-object v0
.end method

.method public final getSourceTypeData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/model/Source;->sourceTypeData:Ljava/util/Map;

    return-object v0
.end method

.method public final getSourceTypeModel()Lcom/stripe/android/model/SourceTypeModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

    return-object v0
.end method

.method public final getStatementDescriptor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->statementDescriptor:Ljava/lang/String;

    return-object v0
.end method

.method public final getStatus()Lcom/stripe/android/model/Source$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->status:Lcom/stripe/android/model/Source$Status;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeRaw()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->typeRaw:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsage()Lcom/stripe/android/model/Source$Usage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->usage:Lcom/stripe/android/model/Source$Usage;

    return-object v0
.end method

.method public final getWeChat()Lcom/stripe/android/model/WeChat;
    .locals 2

    const-string v0, "wechat"

    iget-object v1, p0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->_weChat:Lcom/stripe/android/model/WeChat;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Source type must be \'wechat\'"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->amount:Ljava/lang/Long;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->clientSecret:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/stripe/android/model/Source$CodeVerification;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->created:Ljava/lang/Long;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->currency:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->flow:Lcom/stripe/android/model/Source$Flow;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->isLiveMode:Ljava/lang/Boolean;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->owner:Lcom/stripe/android/model/Source$Owner;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/stripe/android/model/Source$Owner;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->receiver:Lcom/stripe/android/model/Source$Receiver;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/stripe/android/model/Source$Receiver;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->redirect:Lcom/stripe/android/model/Source$Redirect;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/stripe/android/model/Source$Redirect;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->status:Lcom/stripe/android/model/Source$Status;

    if-nez v2, :cond_b

    move v2, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->sourceTypeData:Ljava/util/Map;

    if-nez v2, :cond_c

    move v2, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

    if-nez v2, :cond_d

    move v2, v1

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->typeRaw:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->usage:Lcom/stripe/android/model/Source$Usage;

    if-nez v2, :cond_e

    move v2, v1

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->_weChat:Lcom/stripe/android/model/WeChat;

    if-nez v2, :cond_f

    move v2, v1

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Lcom/stripe/android/model/WeChat;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->_klarna:Lcom/stripe/android/model/Source$Klarna;

    if-nez v2, :cond_10

    move v2, v1

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Lcom/stripe/android/model/Source$Klarna;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->sourceOrder:Lcom/stripe/android/model/SourceOrder;

    if-nez v2, :cond_11

    move v2, v1

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Lcom/stripe/android/model/SourceOrder;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/model/Source;->statementDescriptor:Ljava/lang/String;

    if-nez v2, :cond_12

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_12
    add-int/2addr v0, v1

    return v0
.end method

.method public final isLiveMode()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/Source;->isLiveMode:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/model/Source;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/model/Source;->amount:Ljava/lang/Long;

    iget-object v3, v0, Lcom/stripe/android/model/Source;->clientSecret:Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/model/Source;->codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

    iget-object v5, v0, Lcom/stripe/android/model/Source;->created:Ljava/lang/Long;

    iget-object v6, v0, Lcom/stripe/android/model/Source;->currency:Ljava/lang/String;

    iget-object v7, v0, Lcom/stripe/android/model/Source;->flow:Lcom/stripe/android/model/Source$Flow;

    iget-object v8, v0, Lcom/stripe/android/model/Source;->isLiveMode:Ljava/lang/Boolean;

    iget-object v9, v0, Lcom/stripe/android/model/Source;->owner:Lcom/stripe/android/model/Source$Owner;

    iget-object v10, v0, Lcom/stripe/android/model/Source;->receiver:Lcom/stripe/android/model/Source$Receiver;

    iget-object v11, v0, Lcom/stripe/android/model/Source;->redirect:Lcom/stripe/android/model/Source$Redirect;

    iget-object v12, v0, Lcom/stripe/android/model/Source;->status:Lcom/stripe/android/model/Source$Status;

    iget-object v13, v0, Lcom/stripe/android/model/Source;->sourceTypeData:Ljava/util/Map;

    iget-object v14, v0, Lcom/stripe/android/model/Source;->sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

    iget-object v15, v0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/stripe/android/model/Source;->typeRaw:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/stripe/android/model/Source;->usage:Lcom/stripe/android/model/Source$Usage;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/stripe/android/model/Source;->_weChat:Lcom/stripe/android/model/WeChat;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/stripe/android/model/Source;->_klarna:Lcom/stripe/android/model/Source$Klarna;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/stripe/android/model/Source;->sourceOrder:Lcom/stripe/android/model/SourceOrder;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/stripe/android/model/Source;->statementDescriptor:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v22, v15

    const-string v15, "Source(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clientSecret="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", codeVerification="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", created="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", flow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isLiveMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", owner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receiver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", redirect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceTypeData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceTypeModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", typeRaw="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", usage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", _weChat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", _klarna="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceOrder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", statementDescriptor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/model/Source;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/Source;->amount:Ljava/lang/Long;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/model/Source;->clientSecret:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/Source;->codeVerification:Lcom/stripe/android/model/Source$CodeVerification;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/Source$CodeVerification;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/model/Source;->created:Ljava/lang/Long;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/model/Source;->currency:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/Source;->flow:Lcom/stripe/android/model/Source$Flow;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/model/Source;->isLiveMode:Ljava/lang/Boolean;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_4
    iget-object v0, p0, Lcom/stripe/android/model/Source;->owner:Lcom/stripe/android/model/Source$Owner;

    if-nez v0, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/Source$Owner;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_5
    iget-object v0, p0, Lcom/stripe/android/model/Source;->receiver:Lcom/stripe/android/model/Source$Receiver;

    if-nez v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/Source$Receiver;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_6
    iget-object v0, p0, Lcom/stripe/android/model/Source;->redirect:Lcom/stripe/android/model/Source$Redirect;

    if-nez v0, :cond_7

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/Source$Redirect;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_7
    iget-object v0, p0, Lcom/stripe/android/model/Source;->status:Lcom/stripe/android/model/Source$Status;

    if-nez v0, :cond_8

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_8
    iget-object v0, p0, Lcom/stripe/android/model/Source;->sourceTypeData:Ljava/util/Map;

    if-nez v0, :cond_9

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_a

    :cond_9
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    goto :goto_9

    :cond_a
    :goto_a
    iget-object v0, p0, Lcom/stripe/android/model/Source;->sourceTypeModel:Lcom/stripe/android/model/SourceTypeModel;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/stripe/android/model/Source;->type:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/Source;->typeRaw:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/Source;->usage:Lcom/stripe/android/model/Source$Usage;

    if-nez v0, :cond_b

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_b
    iget-object v0, p0, Lcom/stripe/android/model/Source;->_weChat:Lcom/stripe/android/model/WeChat;

    if-nez v0, :cond_c

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/WeChat;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_c
    iget-object v0, p0, Lcom/stripe/android/model/Source;->_klarna:Lcom/stripe/android/model/Source$Klarna;

    if-nez v0, :cond_d

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_d

    :cond_d
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/Source$Klarna;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_d
    iget-object v0, p0, Lcom/stripe/android/model/Source;->sourceOrder:Lcom/stripe/android/model/SourceOrder;

    if-nez v0, :cond_e

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/SourceOrder;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_e
    iget-object p2, p0, Lcom/stripe/android/model/Source;->statementDescriptor:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
