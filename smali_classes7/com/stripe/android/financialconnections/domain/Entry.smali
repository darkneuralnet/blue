.class public abstract Lcom/stripe/android/financialconnections/domain/Entry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
    with = Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/Entry$Companion;,
        Lcom/stripe/android/financialconnections/domain/Entry$Text;,
        Lcom/stripe/android/financialconnections/domain/Entry$Image;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/Entry;",
        "Landroid/os/Parcelable;",
        "()V",
        "Companion",
        "Image",
        "Text",
        "Lcom/stripe/android/financialconnections/domain/Entry$Image;",
        "Lcom/stripe/android/financialconnections/domain/Entry$Text;",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/domain/Entry$Companion;

.field public static final TYPE_IMAGE:Ljava/lang/String; = "image"

.field public static final TYPE_TEXT:Ljava/lang/String; = "text"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/domain/Entry$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/domain/Entry$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/Entry;->Companion:Lcom/stripe/android/financialconnections/domain/Entry$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/domain/Entry;-><init>()V

    return-void
.end method
