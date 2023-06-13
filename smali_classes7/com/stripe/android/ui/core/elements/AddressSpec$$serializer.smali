.class public final Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmB1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/AddressSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LmB1<",
        "Lcom/stripe/android/ui/core/elements/AddressSpec;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
    message = "This synthesized declaration should not be used directly"
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = ""
        imports = {}
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "com/stripe/android/ui/core/elements/AddressSpec.$serializer",
        "LmB1;",
        "Lcom/stripe/android/ui/core/elements/AddressSpec;",
        "",
        "LKj2;",
        "childSerializers",
        "()[LKj2;",
        "LGV0;",
        "decoder",
        "deserialize",
        "Lrb1;",
        "encoder",
        "value",
        "",
        "serialize",
        "LMs5;",
        "getDescriptor",
        "()LMs5;",
        "descriptor",
        "<init>",
        "()V",
        "payments-ui-core_release"
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

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;

.field private static final synthetic descriptor:LAW3;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;

    new-instance v1, LAW3;

    const-string v2, "com.stripe.android.ui.core.elements.AddressSpec"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v0, v3}, LAW3;-><init>(Ljava/lang/String;LmB1;I)V

    const-string v0, "api_path"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "allowed_country_codes"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "display_fields"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    const-string v0, "show_label"

    invoke-virtual {v1, v0, v2}, LAW3;->k(Ljava/lang/String;Z)V

    sput-object v1, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;->descriptor:LAW3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[LKj2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LKj2<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [LKj2;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    aput-object v2, v0, v1

    new-instance v1, LSr2;

    sget-object v2, LgS5;->a:LgS5;

    invoke-direct {v1, v2}, LSr2;-><init>(LKj2;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, LSr2;

    sget-object v2, Lcom/stripe/android/ui/core/elements/DisplayField;->Companion:Lcom/stripe/android/ui/core/elements/DisplayField$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/DisplayField$Companion;->serializer()LKj2;

    move-result-object v2

    invoke-direct {v1, v2}, LSr2;-><init>(LKj2;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    sget-object v2, LYY;->a:LYY;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public deserialize(LGV0;)Lcom/stripe/android/ui/core/elements/AddressSpec;
    .locals 14

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;->getDescriptor()LMs5;

    move-result-object v0

    invoke-interface {p1, v0}, LGV0;->b(LMs5;)LTt0;

    move-result-object p1

    invoke-interface {p1}, LTt0;->k()Z

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    invoke-interface {p1, v0, v5, v1, v6}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-instance v5, LSr2;

    sget-object v7, LgS5;->a:LgS5;

    invoke-direct {v5, v7}, LSr2;-><init>(LKj2;)V

    invoke-interface {p1, v0, v4, v5, v6}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    new-instance v5, LSr2;

    sget-object v7, Lcom/stripe/android/ui/core/elements/DisplayField;->Companion:Lcom/stripe/android/ui/core/elements/DisplayField$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/ui/core/elements/DisplayField$Companion;->serializer()LKj2;

    move-result-object v7

    invoke-direct {v5, v7}, LSr2;-><init>(LKj2;)V

    invoke-interface {p1, v0, v3, v5, v6}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v0, v2}, LTt0;->E(LMs5;I)Z

    move-result v2

    const/16 v5, 0xf

    move v7, v2

    move-object v9, v3

    move v3, v5

    goto :goto_1

    :cond_0
    move v10, v4

    move v1, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move v6, v1

    :goto_0
    if-eqz v10, :cond_6

    invoke-interface {p1, v0}, LTt0;->q(LMs5;)I

    move-result v11

    const/4 v12, -0x1

    if-eq v11, v12, :cond_5

    if-eqz v11, :cond_4

    if-eq v11, v4, :cond_3

    if-eq v11, v3, :cond_2

    if-ne v11, v2, :cond_1

    invoke-interface {p1, v0, v2}, LTt0;->E(LMs5;I)Z

    move-result v1

    or-int/lit8 v6, v6, 0x8

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {p1, v11}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw p1

    :cond_2
    new-instance v11, LSr2;

    sget-object v12, Lcom/stripe/android/ui/core/elements/DisplayField;->Companion:Lcom/stripe/android/ui/core/elements/DisplayField$Companion;

    invoke-virtual {v12}, Lcom/stripe/android/ui/core/elements/DisplayField$Companion;->serializer()LKj2;

    move-result-object v12

    invoke-direct {v11, v12}, LSr2;-><init>(LKj2;)V

    invoke-interface {p1, v0, v3, v11, v9}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    or-int/lit8 v6, v6, 0x4

    goto :goto_0

    :cond_3
    new-instance v11, LSr2;

    sget-object v12, LgS5;->a:LgS5;

    invoke-direct {v11, v12}, LSr2;-><init>(LKj2;)V

    invoke-interface {p1, v0, v4, v11, v8}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    or-int/lit8 v6, v6, 0x2

    goto :goto_0

    :cond_4
    sget-object v11, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    invoke-interface {p1, v0, v5, v11, v7}, LTt0;->s(LMs5;ILE01;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    or-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    move v10, v5

    goto :goto_0

    :cond_6
    move v3, v6

    move-object v4, v8

    move-object v13, v7

    move v7, v1

    move-object v1, v13

    :goto_1
    invoke-interface {p1, v0}, LTt0;->a(LMs5;)V

    new-instance p1, Lcom/stripe/android/ui/core/elements/AddressSpec;

    move-object v0, v1

    check-cast v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-object v5, v4

    check-cast v5, Ljava/util/Set;

    move-object v6, v9

    check-cast v6, Ljava/util/Set;

    const/4 v8, 0x0

    move-object v2, p1

    move-object v4, v0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLbt5;)V

    return-object p1
.end method

.method public bridge synthetic deserialize(LGV0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;->deserialize(LGV0;)Lcom/stripe/android/ui/core/elements/AddressSpec;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;->descriptor:LAW3;

    return-object v0
.end method

.method public serialize(Lrb1;Lcom/stripe/android/ui/core/elements/AddressSpec;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;->getDescriptor()LMs5;

    move-result-object v0

    invoke-interface {p1, v0}, Lrb1;->b(LMs5;)LUt0;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->write$Self(Lcom/stripe/android/ui/core/elements/AddressSpec;LUt0;LMs5;)V

    invoke-interface {p1, v0}, LUt0;->a(LMs5;)V

    return-void
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/stripe/android/ui/core/elements/AddressSpec;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;->serialize(Lrb1;Lcom/stripe/android/ui/core/elements/AddressSpec;)V

    return-void
.end method

.method public typeParametersSerializers()[LKj2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "LKj2<",
            "*>;"
        }
    .end annotation

    invoke-static {p0}, LmB1$a;->a(LmB1;)[LKj2;

    move-result-object v0

    return-object v0
.end method
