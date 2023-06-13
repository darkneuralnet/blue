.class public final LjV1$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjV1;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LZV1;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LZV1;",
        "kotlin.jvm.PlatformType",
        "identificationStatusState",
        "",
        "a",
        "(LZV1;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdentificationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationPresenter.kt\nco/bird/android/feature/identification/IdentificationPresenter$initializeStreams$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,511:1\n1#2:512\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LjV1;


# direct methods
.method public constructor <init>(LjV1;)V
    .locals 0

    iput-object p1, p0, LjV1$p;->g:LjV1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LZV1;)V
    .locals 3

    invoke-virtual {p1}, LZV1;->b()Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    move-result-object v0

    iget-object v1, p0, LjV1$p;->g:LjV1;

    invoke-static {v1}, LjV1;->access$getCurrentLocale$p(LjV1;)La94;

    move-result-object v1

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "currentLocale.value"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Locale;

    invoke-virtual {v0, v1}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->defaultLocale(Ljava/util/Locale;)Ljava/util/Locale;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LjV1$p;->g:LjV1;

    invoke-static {v1}, LjV1;->access$getCurrentLocale$p(LjV1;)La94;

    move-result-object v1

    invoke-virtual {v1, v0}, La94;->accept(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, LZV1;->b()Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    move-result-object p1

    iget-object v0, p0, LjV1$p;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getCurrentLocale$p(LjV1;)La94;

    move-result-object v0

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "currentLocale.value.country"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;->defaultDocumentType(Ljava/lang/String;)Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LjV1$p;->g:LjV1;

    invoke-static {v0}, LjV1;->access$getCurrentDocumentType$p(LjV1;)La94;

    move-result-object v0

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZV1;

    invoke-virtual {p0, p1}, LjV1$p;->a(LZV1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
