.class public final LUD3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUD3$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LUD3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LUD3$c<",
        "TValue;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00010\u0001B5\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0002H\u0016R \u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008R&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "LUD3$b;",
        "LUD3$c;",
        "",
        "data",
        "",
        "a",
        "LEc2$a;",
        "LIa2;",
        "LEc2$a;",
        "loadCallback",
        "LEc2$d;",
        "LTD3;",
        "b",
        "LEc2$d;",
        "params",
        "<init>",
        "(LUD3;LEc2$a;LEc2$d;)V",
        "widget_release"
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
        "SMAP\nPageItemKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource$LoadBeforeCallbackDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1559#2:183\n1590#2,4:184\n*S KotlinDebug\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource$LoadBeforeCallbackDelegate\n*L\n82#1:183\n82#1:184,4\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LEc2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEc2$a<",
            "LIa2<",
            "TValue;>;>;"
        }
    .end annotation
.end field

.field public final b:LEc2$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEc2$d<",
            "LTD3<",
            "TKey;TValue;>;>;"
        }
    .end annotation
.end field

.field public final synthetic c:LUD3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LUD3<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LUD3;LEc2$a;LEc2$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc2$a<",
            "LIa2<",
            "TValue;>;>;",
            "LEc2$d<",
            "LTD3<",
            "TKey;TValue;>;>;)V"
        }
    .end annotation

    const-string v0, "loadCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LUD3$b;->c:LUD3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LUD3$b;->a:LEc2$a;

    iput-object p3, p0, LUD3$b;->b:LEc2$d;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TValue;>;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUD3$b;->c:LUD3;

    iget-object v1, p0, LUD3$b;->b:LEc2$d;

    iget-object v1, v1, LEc2$d;->a:Ljava/lang/Object;

    check-cast v1, LTD3;

    invoke-virtual {v1}, LTD3;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p1, v1}, LUD3;->access$removeIncludingAndAfter(LUD3;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    new-instance v5, LIa2;

    iget-object v6, p0, LUD3$b;->b:LEc2$d;

    iget-object v6, v6, LEc2$d;->a:Ljava/lang/Object;

    check-cast v6, LTD3;

    invoke-virtual {v6}, LTD3;->c()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v8

    int-to-long v8, v8

    sub-long/2addr v6, v8

    int-to-long v8, v2

    add-long/2addr v6, v8

    invoke-direct {v5, v6, v7, v3}, LIa2;-><init>(JLjava/lang/Object;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    :cond_1
    iget-object p1, p0, LUD3$b;->a:LEc2$a;

    invoke-virtual {p1, v1}, LEc2$a;->a(Ljava/util/List;)V

    return-void
.end method
