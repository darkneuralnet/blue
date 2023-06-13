.class public final Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;
.super Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;
.source "SourceFile"


# annotations
.annotation runtime LVs5;
    value = "redirect_to_url"
.end annotation

.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RedirectNextActionSpec"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$$serializer;,
        Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001d\u0010\u001eB3\u0008\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\n\u0008\u0001\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\u001d\u0010\"J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\tH\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\tH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003R \u0010\u000c\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0016\u0012\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0017\u0010\u0018R \u0010\r\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u0016\u0012\u0004\u0008\u001c\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0018\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;",
        "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;",
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
        "urlPath",
        "returnUrlPath",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "Ljava/lang/String;",
        "getUrlPath",
        "()Ljava/lang/String;",
        "getUrlPath$annotations",
        "()V",
        "getReturnUrlPath",
        "getReturnUrlPath$annotations",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lbt5;)V",
        "Companion",
        "$serializer",
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

.field public static final Companion:Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$Companion;


# instance fields
.field private final returnUrlPath:Ljava/lang/String;

.field private final urlPath:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->Companion:Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lbt5;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "url_path"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "return_url_path"
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

    and-int/lit8 p4, p1, 0x0

    if-eqz p4, :cond_0

    sget-object p4, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$$serializer;

    invoke-virtual {p4}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec$$serializer;->getDescriptor()LMs5;

    move-result-object p4

    const/4 v0, 0x0

    invoke-static {p1, v0, p4}, LzW3;->b(IILMs5;)V

    :cond_0
    const/4 p4, 0x0

    invoke-direct {p0, p4}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 p4, p1, 0x1

    if-nez p4, :cond_1

    const-string p2, "next_action[redirect_to_url][url]"

    :cond_1
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_2

    const-string p1, "next_action[redirect_to_url][return_url]"

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "urlPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "returnUrlPath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const-string p1, "next_action[redirect_to_url][url]"

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const-string p2, "next_action[redirect_to_url][return_url]"

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->copy(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getReturnUrlPath$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "return_url_path"
    .end annotation

    return-void
.end method

.method public static synthetic getUrlPath$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "url_path"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;LUt0;LMs5;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    const-string v3, "next_action[redirect_to_url][url]"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, LUt0;->w(LMs5;ILjava/lang/String;)V

    :cond_2
    invoke-interface {p1, p2, v2}, LUt0;->s(LMs5;I)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_2
    move v0, v2

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    const-string v3, "next_action[redirect_to_url][return_url]"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_3
    if-eqz v0, :cond_5

    iget-object p0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    invoke-interface {p1, p2, v2, p0}, LUt0;->w(LMs5;ILjava/lang/String;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;
    .locals 1

    const-string v0, "urlPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "returnUrlPath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getReturnUrlPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrlPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->urlPath:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs$RedirectNextActionSpec;->returnUrlPath:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RedirectNextActionSpec(urlPath="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", returnUrlPath="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
