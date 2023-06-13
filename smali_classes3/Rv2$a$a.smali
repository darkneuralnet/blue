.class public final LRv2$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/libraries/places/widget/listener/PlaceSelectionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRv2$a;->a(LTv2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Rv2$a$a",
        "Lcom/google/android/libraries/places/widget/listener/PlaceSelectionListener;",
        "Lcom/google/android/gms/common/api/Status;",
        "status",
        "",
        "onError",
        "Lcom/google/android/libraries/places/api/model/Place;",
        "place",
        "onPlaceSelected",
        "locals-survey_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:LRv2;


# direct methods
.method public constructor <init>(LRv2;)V
    .locals 0

    iput-object p1, p0, LRv2$a$a;->b:LRv2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LRv2$a$a;->b:LRv2;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LRv2;->access$setAttemptedPlaceSearch$p(LRv2;Z)V

    iget-object v0, p0, LRv2$a$a;->b:LRv2;

    invoke-static {v0}, LRv2;->access$getLogger(LRv2;)Lg46$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error on autocomplete places widget: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LRv2$a$a;->b:LRv2;

    new-instance v1, LWT3;

    invoke-direct {v1, p1}, LWT3;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onPlaceSelected(Lcom/google/android/libraries/places/api/model/Place;)V
    .locals 3

    const-string v0, "place"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LRv2$a$a;->b:LRv2;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LRv2;->access$setAttemptedPlaceSearch$p(LRv2;Z)V

    iget-object v0, p0, LRv2$a$a;->b:LRv2;

    invoke-static {v0}, LRv2;->access$getLogger(LRv2;)Lg46$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Autocomplete place selected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, LLi1;->b(Lcom/google/android/libraries/places/api/model/Place;)Lcom/google/android/libraries/places/api/model/AddressComponent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/libraries/places/api/model/AddressComponent;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LRv2$a$a;->b:LRv2;

    invoke-static {v1}, LRv2;->access$getAutocompleteSupportFragment$p(LRv2;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;->setText(Ljava/lang/CharSequence;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    if-eqz v0, :cond_1

    iget-object v0, p0, LRv2$a$a;->b:LRv2;

    new-instance v1, LNU3;

    invoke-direct {v1, p1}, LNU3;-><init>(Lcom/google/android/libraries/places/api/model/Place;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LRv2$a$a;->b:LRv2;

    new-instance v1, LMU3;

    invoke-direct {v1, p1}, LMU3;-><init>(Lcom/google/android/libraries/places/api/model/Place;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
