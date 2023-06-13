.class public final LRU5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\rR(\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u000c\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u000f\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "LRU5;",
        "",
        "",
        "valid",
        "Landroid/content/Context;",
        "context",
        "",
        "a",
        "LfM2;",
        "LfM2;",
        "marker",
        "LPT;",
        "b",
        "LPT;",
        "validPinDescriptor",
        "c",
        "invalidPinDescriptor",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "value",
        "getPosition",
        "()Lcom/google/android/gms/maps/model/LatLng;",
        "(Lcom/google/android/gms/maps/model/LatLng;)V",
        "position",
        "isVisible",
        "()Ljava/lang/Boolean;",
        "(Ljava/lang/Boolean;)V",
        "<init>",
        "(LfM2;)V",
        "suggest-a-nest_release"
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
        "SMAP\nSuggestionPinMarker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestionPinMarker.kt\nco/bird/android/feature/suggestanest/SuggestionPinMarker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LfM2;

.field public b:LPT;

.field public c:LPT;


# direct methods
.method public constructor <init>(LfM2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRU5;->a:LfM2;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, LRU5;->b:LPT;

    if-nez p1, :cond_1

    sget v1, Lkg4;->ic_suggestion_pin_valid:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, LfB0;->icon$default(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object p1

    iput-object p1, p0, LRU5;->b:LPT;

    goto :goto_0

    :cond_0
    iget-object p1, p0, LRU5;->c:LPT;

    if-nez p1, :cond_1

    sget v1, Lkg4;->ic_suggestion_pin_invalid:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v5}, LfB0;->icon$default(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object p1

    iput-object p1, p0, LRU5;->c:LPT;

    :cond_1
    :goto_0
    iget-object p2, p0, LRU5;->a:LfM2;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1}, LfM2;->k(LPT;)V

    :cond_2
    return-void
.end method

.method public final b(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, LRU5;->a:LfM2;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final c(Ljava/lang/Boolean;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object v0, p0, LRU5;->a:LfM2;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, LfM2;->r(Z)V

    :cond_1
    :goto_0
    return-void
.end method
