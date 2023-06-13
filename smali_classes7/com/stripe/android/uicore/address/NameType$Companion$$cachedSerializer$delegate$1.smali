.class final Lcom/stripe/android/uicore/address/NameType$Companion$$cachedSerializer$delegate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/address/NameType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LKj2<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/uicore/address/NameType$Companion$$cachedSerializer$delegate$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/uicore/address/NameType$Companion$$cachedSerializer$delegate$1;

    invoke-direct {v0}, Lcom/stripe/android/uicore/address/NameType$Companion$$cachedSerializer$delegate$1;-><init>()V

    sput-object v0, Lcom/stripe/android/uicore/address/NameType$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/uicore/address/NameType$Companion$$cachedSerializer$delegate$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LKj2;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LKj2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/stripe/android/uicore/address/NameType;->values()[Lcom/stripe/android/uicore/address/NameType;

    move-result-object v0

    const-string v1, "area"

    const-string v2, "cedex"

    const-string v3, "city"

    const-string v4, "country"

    const-string v5, "county"

    const-string v6, "department"

    const-string v7, "district"

    const-string v8, "do_si"

    const-string v9, "eircode"

    const-string v10, "emirate"

    const-string v11, "island"

    const-string v12, "neighborhood"

    const-string v13, "oblast"

    const-string v14, "parish"

    const-string v15, "pin"

    const-string v16, "post_town"

    const-string v17, "postal"

    const-string v18, "prefecture"

    const-string v19, "province"

    const-string v20, "state"

    const-string v21, "suburb"

    const-string v22, "suburb_or_city"

    const-string v23, "townland"

    const-string v24, "village_township"

    const-string v25, "zip"

    filled-new-array/range {v1 .. v25}, [Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x19

    new-array v2, v2, [[Ljava/lang/annotation/Annotation;

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aput-object v4, v2, v3

    const/4 v3, 0x3

    aput-object v4, v2, v3

    const/4 v3, 0x4

    aput-object v4, v2, v3

    const/4 v3, 0x5

    aput-object v4, v2, v3

    const/4 v3, 0x6

    aput-object v4, v2, v3

    const/4 v3, 0x7

    aput-object v4, v2, v3

    const/16 v3, 0x8

    aput-object v4, v2, v3

    const/16 v3, 0x9

    aput-object v4, v2, v3

    const/16 v3, 0xa

    aput-object v4, v2, v3

    const/16 v3, 0xb

    aput-object v4, v2, v3

    const/16 v3, 0xc

    aput-object v4, v2, v3

    const/16 v3, 0xd

    aput-object v4, v2, v3

    const/16 v3, 0xe

    aput-object v4, v2, v3

    const/16 v3, 0xf

    aput-object v4, v2, v3

    const/16 v3, 0x10

    aput-object v4, v2, v3

    const/16 v3, 0x11

    aput-object v4, v2, v3

    const/16 v3, 0x12

    aput-object v4, v2, v3

    const/16 v3, 0x13

    aput-object v4, v2, v3

    const/16 v3, 0x14

    aput-object v4, v2, v3

    const/16 v3, 0x15

    aput-object v4, v2, v3

    const/16 v3, 0x16

    aput-object v4, v2, v3

    const/16 v3, 0x17

    aput-object v4, v2, v3

    const/16 v3, 0x18

    aput-object v4, v2, v3

    const-string v3, "com.stripe.android.uicore.address.NameType"

    invoke-static {v3, v0, v1, v2}, Lrf1;->a(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)LKj2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/address/NameType$Companion$$cachedSerializer$delegate$1;->invoke()LKj2;

    move-result-object v0

    return-object v0
.end method
