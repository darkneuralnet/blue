.class public final LrY5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMt6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LMt6<",
        "Lcom/google/android/material/tabs/TabLayout$TabView;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u000c\u0012\u0008\u0012\u00060\u0002R\u00020\u00030\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J$\u0010\t\u001a\u00020\u0008*\u00060\u0002R\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016R$\u0010\u000f\u001a\u000c\u0012\u0008\u0012\u00060\u0002R\u00020\u00030\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR \u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "LrY5;",
        "LMt6;",
        "Lcom/google/android/material/tabs/TabLayout$TabView;",
        "Lcom/google/android/material/tabs/TabLayout;",
        "",
        "",
        "",
        "attrs",
        "",
        "c",
        "Ljava/lang/Class;",
        "b",
        "Ljava/lang/Class;",
        "getViewType",
        "()Ljava/lang/Class;",
        "viewType",
        "",
        "Ljava/util/Set;",
        "a",
        "()Ljava/util/Set;",
        "supportedAttributes",
        "<init>",
        "()V",
        "reword_release"
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
        "SMAP\nTabViewViewTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/TabViewViewTransformer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,26:1\n215#2,2:27\n*S KotlinDebug\n*F\n+ 1 TabViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/TabViewViewTransformer\n*L\n20#1:27,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LrY5;

.field public static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcom/google/android/material/tabs/TabLayout$TabView;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LrY5;

    invoke-direct {v0}, LrY5;-><init>()V

    sput-object v0, LrY5;->a:LrY5;

    const-class v0, Lcom/google/android/material/tabs/TabLayout$TabView;

    sput-object v0, LrY5;->b:Ljava/lang/Class;

    const-string v0, "text"

    const-string v1, "android:text"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LrY5;->c:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, LrY5;->c:Ljava/util/Set;

    return-object v0
.end method

.method public bridge synthetic b(Landroid/view/View;Ljava/util/Map;)V
    .locals 0

    check-cast p1, Lcom/google/android/material/tabs/TabLayout$TabView;

    invoke-virtual {p0, p1, p2}, LrY5;->c(Lcom/google/android/material/tabs/TabLayout$TabView;Ljava/util/Map;)V

    return-void
.end method

.method public c(Lcom/google/android/material/tabs/TabLayout$TabView;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/tabs/TabLayout$TabView;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "android:text"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const-string v2, "text"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, LrY5$a;

    invoke-direct {v1, p1}, LrY5$a;-><init>(Lcom/google/android/material/tabs/TabLayout$TabView;)V

    invoke-static {p1, v0, v1}, LYq6;->a(Landroid/view/View;ILkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public getViewType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/google/android/material/tabs/TabLayout$TabView;",
            ">;"
        }
    .end annotation

    sget-object v0, LrY5;->b:Ljava/lang/Class;

    return-object v0
.end method
