.class public final Lcom/stripe/android/uicore/address/FieldType$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/address/FieldType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u00c6\u0001\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/FieldType$Companion;",
        "",
        "",
        "value",
        "Lcom/stripe/android/uicore/address/FieldType;",
        "from",
        "LKj2;",
        "serializer",
        "<init>",
        "()V",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransformAddressToElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformAddressToElement.kt\ncom/stripe/android/uicore/address/FieldType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,360:1\n1282#2,2:361\n*S KotlinDebug\n*F\n+ 1 TransformAddressToElement.kt\ncom/stripe/android/uicore/address/FieldType$Companion\n*L\n99#1:361,2\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/uicore/address/FieldType$Companion;-><init>()V

    return-void
.end method

.method private final synthetic get$cachedSerializer$delegate()Lkotlin/Lazy;
    .locals 1

    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final from(Ljava/lang/String;)Lcom/stripe/android/uicore/address/FieldType;
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->values()[Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/FieldType;->getSerializedValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method

.method public final serializer()LKj2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LKj2<",
            "Lcom/stripe/android/uicore/address/FieldType;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/uicore/address/FieldType$Companion;->get$cachedSerializer$delegate()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKj2;

    return-object v0
.end method
