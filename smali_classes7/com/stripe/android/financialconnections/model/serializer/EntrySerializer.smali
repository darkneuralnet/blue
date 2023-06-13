.class public final Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;
.super Lki2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lki2<",
        "Lcom/stripe/android/financialconnections/domain/Entry;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;",
        "Lki2;",
        "Lcom/stripe/android/financialconnections/domain/Entry;",
        "Lxi2;",
        "element",
        "LKj2;",
        "selectDeserializer",
        "",
        "getTypeValue",
        "(Lxi2;)Ljava/lang/String;",
        "typeValue",
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/domain/Entry;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-direct {p0, v0}, Lki2;-><init>(Lkotlin/reflect/KClass;)V

    return-void
.end method

.method private final getTypeValue(Lxi2;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Lzi2;->k(Lxi2;)LSi2;

    move-result-object p1

    const-string v0, "type"

    invoke-virtual {p1, v0}, LSi2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxi2;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lzi2;->l(Lxi2;)LYi2;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYi2;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic selectDeserializer(Lxi2;)LE01;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;->selectDeserializer(Lxi2;)LKj2;

    move-result-object p1

    return-object p1
.end method

.method public selectDeserializer(Lxi2;)LKj2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxi2;",
            ")",
            "LKj2<",
            "+",
            "Lcom/stripe/android/financialconnections/domain/Entry;",
            ">;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;->getTypeValue(Lxi2;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lcom/stripe/android/financialconnections/domain/Entry$Text;->Companion:Lcom/stripe/android/financialconnections/domain/Entry$Text$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/domain/Entry$Text$Companion;->serializer()LKj2;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v1, "image"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/stripe/android/financialconnections/domain/Entry$Image;->Companion:Lcom/stripe/android/financialconnections/domain/Entry$Image$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/domain/Entry$Image$Companion;->serializer()LKj2;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;->getTypeValue(Lxi2;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown type! "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
