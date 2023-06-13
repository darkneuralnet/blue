.class public final LgU1$E;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgU1;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "selected",
        "Lio/reactivex/u;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/identification/IdentificationDocumentType;)Lio/reactivex/u;"
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
        "SMAP\nIdentificationManualEntryFormBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormBottomSheet.kt\nco/bird/android/feature/identification/bottomsheet/IdentificationManualEntryFormBottomSheet$onViewCreated$7\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n1#2:347\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LgU1;

.field public final synthetic h:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public constructor <init>(LgU1;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0

    iput-object p1, p0, LgU1$E;->g:LgU1;

    iput-object p2, p0, LgU1$E;->h:Lco/bird/android/core/mvp/BaseActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/identification/IdentificationDocumentType;)Lio/reactivex/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/identification/IdentificationDocumentType;",
            ">;"
        }
    .end annotation

    const-string v0, "selected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "doc type clicked"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LgU1$E;->g:LgU1;

    invoke-static {v0}, LgU1;->access$getAcceptableManualEntry(LgU1;)Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getAllowedSpecialDocumentTypes()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_0
    check-cast v0, Ljava/util/Collection;

    iget-object v1, p0, LgU1$E;->g:LgU1;

    invoke-static {v1}, LgU1;->access$getAcceptableManualEntry(LgU1;)Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;->getAllowedDocumentTypes()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :goto_0
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    sget-object v0, Lco/bird/android/model/identification/IdentificationDocumentType;->Companion:Lco/bird/android/model/identification/IdentificationDocumentType$Companion;

    invoke-virtual {v0}, Lco/bird/android/model/identification/IdentificationDocumentType$Companion;->selectableValues()Ljava/util/List;

    move-result-object v0

    :cond_3
    sget-object v1, LQ51;->f:LQ51$a;

    invoke-virtual {v1, v0, p1}, LQ51$a;->a(Ljava/util/List;Lco/bird/android/model/identification/IdentificationDocumentType;)LQ51;

    move-result-object p1

    iget-object v0, p0, LgU1$E;->h:Lco/bird/android/core/mvp/BaseActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "DocumentTypePickerBottomSheet"

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-virtual {p1}, LQ51;->a5()Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/identification/IdentificationDocumentType;

    invoke-virtual {p0, p1}, LgU1$E;->a(Lco/bird/android/model/identification/IdentificationDocumentType;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
