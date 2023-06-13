.class public final Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;
.super Loj2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Loj2<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0014\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;",
        "Loj2;",
        "",
        "Lxi2;",
        "element",
        "transformDeserialize",
        "<init>",
        "()V",
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v0}, Lb40;->D(Lkotlin/jvm/internal/StringCompanionObject;)LKj2;

    move-result-object v0

    invoke-direct {p0, v0}, Loj2;-><init>(LKj2;)V

    return-void
.end method


# virtual methods
.method public transformDeserialize(Lxi2;)Lxi2;
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzi2;->c(Ljava/lang/String;)LYi2;

    move-result-object p1

    return-object p1
.end method
