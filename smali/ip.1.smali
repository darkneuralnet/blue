.class public Lip;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lip$b;,
        Lip$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "AsyncPagedListDiffer is deprecated and has been replaced by AsyncPagingDataDiffer"
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = "AsyncPagingDataDiffer<T>"
        imports = {
            "androidx.paging.AsyncPagingDataDiffer"
        }
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0017\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u001e&B#\u0008\u0017\u0012\n\u0010b\u001a\u0006\u0012\u0002\u0008\u00030a\u0012\u000c\u0010d\u001a\u0008\u0012\u0004\u0012\u00028\u00000c\u00a2\u0006\u0004\u0008e\u0010fJ2\u0010\t\u001a\u00020\u00082\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0019\u0010\u000c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00082\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016J\"\u0010\u0010\u001a\u00020\u00082\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016JM\u0010\u0018\u001a\u00020\u00082\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\n2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J0\u0010\u001c\u001a\u00020\u00082(\u0010\u001b\u001a$\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00080\u001aR\"\u0010$\u001a\u00020\u001d8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R&\u0010,\u001a\u0008\u0012\u0004\u0012\u00028\u00000%8\u0000X\u0080\u0004\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u0012\u0004\u0008*\u0010+\u001a\u0004\u0008(\u0010)R\"\u00103\u001a\u00020-8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010.\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R,\u0010;\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u000005048\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u00086\u00107\u0012\u0004\u0008:\u0010+\u001a\u0004\u00088\u00109R$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010<\u0012\u0004\u0008=\u0010+R$\u0010@\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008>\u0010<\u0012\u0004\u0008?\u0010+R(\u0010H\u001a\u00020\n8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0004\u0008A\u0010B\u0012\u0004\u0008G\u0010+\u001a\u0004\u0008C\u0010D\"\u0004\u0008E\u0010FR\u001a\u0010L\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010J\u0012\u0004\u0008K\u0010+RD\u0010U\u001a2\u0012\u0013\u0012\u00110N\u00a2\u0006\u000c\u0008O\u0012\u0008\u0008P\u0012\u0004\u0008\u0008(Q\u0012\u0013\u0012\u00110R\u00a2\u0006\u000c\u0008O\u0012\u0008\u0008P\u0012\u0004\u0008\u0008(S\u0012\u0004\u0012\u00020\u00080M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010TR2\u0010Y\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00080\u001a0V8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010W\u001a\u0004\u0008A\u0010XR\u001a\u0010]\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010[\u0012\u0004\u0008\\\u0010+R\u0014\u0010^\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010DR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038VX\u0096\u0004\u00a2\u0006\u000c\u0012\u0004\u0008`\u0010+\u001a\u0004\u00086\u0010_\u00a8\u0006g"
    }
    d2 = {
        "Lip;",
        "",
        "T",
        "LZD3;",
        "previousList",
        "currentList",
        "Ljava/lang/Runnable;",
        "commitCallback",
        "",
        "j",
        "",
        "index",
        "e",
        "(I)Ljava/lang/Object;",
        "pagedList",
        "l",
        "m",
        "newList",
        "diffSnapshot",
        "Lmd3;",
        "diffResult",
        "LLs4;",
        "recordingCallback",
        "lastAccessIndex",
        "i",
        "(LZD3;LZD3;Lmd3;LLs4;ILjava/lang/Runnable;)V",
        "Lkotlin/Function2;",
        "callback",
        "c",
        "LBs2;",
        "a",
        "LBs2;",
        "h",
        "()LBs2;",
        "k",
        "(LBs2;)V",
        "updateCallback",
        "Landroidx/recyclerview/widget/c;",
        "b",
        "Landroidx/recyclerview/widget/c;",
        "getConfig$paging_runtime_release",
        "()Landroidx/recyclerview/widget/c;",
        "getConfig$paging_runtime_release$annotations",
        "()V",
        "config",
        "Ljava/util/concurrent/Executor;",
        "Ljava/util/concurrent/Executor;",
        "getMainThreadExecutor$paging_runtime_release",
        "()Ljava/util/concurrent/Executor;",
        "setMainThreadExecutor$paging_runtime_release",
        "(Ljava/util/concurrent/Executor;)V",
        "mainThreadExecutor",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Lip$b;",
        "d",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "getListeners$paging_runtime_release",
        "()Ljava/util/concurrent/CopyOnWriteArrayList;",
        "getListeners$paging_runtime_release$annotations",
        "listeners",
        "LZD3;",
        "getPagedList$annotations",
        "f",
        "getSnapshot$annotations",
        "snapshot",
        "g",
        "I",
        "getMaxScheduledGeneration$paging_runtime_release",
        "()I",
        "setMaxScheduledGeneration$paging_runtime_release",
        "(I)V",
        "getMaxScheduledGeneration$paging_runtime_release$annotations",
        "maxScheduledGeneration",
        "LZD3$e;",
        "LZD3$e;",
        "getLoadStateManager$annotations",
        "loadStateManager",
        "Lkotlin/reflect/KFunction2;",
        "Lpt2;",
        "Lkotlin/ParameterName;",
        "name",
        "type",
        "Lot2;",
        "state",
        "Lkotlin/reflect/KFunction;",
        "loadStateListener",
        "",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "loadStateListeners",
        "LZD3$b;",
        "LZD3$b;",
        "getPagedListCallback$annotations",
        "pagedListCallback",
        "itemCount",
        "()LZD3;",
        "getCurrentList$annotations",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "adapter",
        "Landroidx/recyclerview/widget/h$f;",
        "diffCallback",
        "<init>",
        "(Landroidx/recyclerview/widget/RecyclerView$h;Landroidx/recyclerview/widget/h$f;)V",
        "paging-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public a:LBs2;

.field public final b:Landroidx/recyclerview/widget/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public c:Ljava/util/concurrent/Executor;

.field public final d:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lip$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public e:LZD3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZD3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public f:LZD3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZD3<",
            "TT;>;"
        }
    .end annotation
.end field

.field public g:I

.field public final h:LZD3$e;

.field public final i:Lkotlin/reflect/KFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/KFunction<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function2<",
            "Lpt2;",
            "Lot2;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field public final k:LZD3$b;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$h;Landroidx/recyclerview/widget/h$f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$h<",
            "*>;",
            "Landroidx/recyclerview/widget/h$f<",
            "TT;>;)V"
        }
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "PagedList is deprecated and has been replaced by PagingData"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                diffCallback,\n                listUpdateCallback\n            )"
            imports = {
                "androidx.paging.AsyncPagingDataDiffer",
                "kotlinx.coroutines.Dispatchers"
            }
        .end subannotation
    .end annotation

    const-string v0, "adapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diffCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LEm;->i()Ljava/util/concurrent/Executor;

    move-result-object v0

    const-string v1, "getMainThreadExecutor()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lip;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lip;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Lip$d;

    invoke-direct {v0, p0}, Lip$d;-><init>(Lip;)V

    iput-object v0, p0, Lip;->h:LZD3$e;

    new-instance v1, Lip$c;

    invoke-direct {v1, v0}, Lip$c;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lip;->i:Lkotlin/reflect/KFunction;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lip;->j:Ljava/util/List;

    new-instance v0, Lip$e;

    invoke-direct {v0, p0}, Lip$e;-><init>(Lip;)V

    iput-object v0, p0, Lip;->k:LZD3$b;

    new-instance v0, Landroidx/recyclerview/widget/b;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/b;-><init>(Landroidx/recyclerview/widget/RecyclerView$h;)V

    invoke-virtual {p0, v0}, Lip;->k(LBs2;)V

    new-instance p1, Landroidx/recyclerview/widget/c$a;

    invoke-direct {p1, p2}, Landroidx/recyclerview/widget/c$a;-><init>(Landroidx/recyclerview/widget/h$f;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/c$a;->a()Landroidx/recyclerview/widget/c;

    move-result-object p1

    const-string p2, "Builder(diffCallback).build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lip;->b:Landroidx/recyclerview/widget/c;

    return-void
.end method

.method public static synthetic a(Lip;ILZD3;LZD3;Lmd3;LLs4;LZD3;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lip;->o(Lip;ILZD3;LZD3;Lmd3;LLs4;LZD3;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(LZD3;LZD3;Lip;ILZD3;LLs4;Ljava/lang/Runnable;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lip;->n(LZD3;LZD3;Lip;ILZD3;LLs4;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final n(LZD3;LZD3;Lip;ILZD3;LLs4;Ljava/lang/Runnable;)V
    .locals 11

    move-object v1, p2

    const-string v0, "$newSnapshot"

    move-object v4, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$recordingCallback"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZD3;->D()Lnd3;

    move-result-object v0

    invoke-virtual {p1}, LZD3;->D()Lnd3;

    move-result-object v2

    iget-object v3, v1, Lip;->b:Landroidx/recyclerview/widget/c;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/c;->b()Landroidx/recyclerview/widget/h$f;

    move-result-object v3

    const-string v5, "config.diffCallback"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2, v3}, Lod3;->a(Lnd3;Lnd3;Landroidx/recyclerview/widget/h$f;)Lmd3;

    move-result-object v5

    iget-object v9, v1, Lip;->c:Ljava/util/concurrent/Executor;

    new-instance v10, Lhp;

    move-object v0, v10

    move v2, p3

    move-object v3, p4

    move-object v7, p0

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lhp;-><init>(Lip;ILZD3;LZD3;Lmd3;LLs4;LZD3;Ljava/lang/Runnable;)V

    invoke-interface {v9, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final o(Lip;ILZD3;LZD3;Lmd3;LLs4;LZD3;Ljava/lang/Runnable;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$newSnapshot"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$result"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$recordingCallback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lip;->g:I

    if-ne v0, p1, :cond_0

    invoke-virtual {p6}, LZD3;->K()I

    move-result v6

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p7

    invoke-virtual/range {v1 .. v7}, Lip;->i(LZD3;LZD3;Lmd3;LLs4;ILjava/lang/Runnable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LZD3<",
            "TT;>;-",
            "LZD3<",
            "TT;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lip;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lip$a;

    invoke-direct {v1, p1}, Lip$a;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d()LZD3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZD3<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lip;->f:LZD3;

    if-nez v0, :cond_0

    iget-object v0, p0, Lip;->e:LZD3;

    :cond_0
    return-object v0
.end method

.method public e(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lip;->f:LZD3;

    iget-object v1, p0, Lip;->e:LZD3;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LZD3;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, LZD3;->L(I)V

    invoke-virtual {v1, p1}, LZD3;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Item count is zero, getItem() call is invalid"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()I
    .locals 1

    invoke-virtual {p0}, Lip;->d()LZD3;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LZD3;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function2<",
            "Lpt2;",
            "Lot2;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lip;->j:Ljava/util/List;

    return-object v0
.end method

.method public final h()LBs2;
    .locals 1

    iget-object v0, p0, Lip;->a:LBs2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "updateCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i(LZD3;LZD3;Lmd3;LLs4;ILjava/lang/Runnable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZD3<",
            "TT;>;",
            "LZD3<",
            "TT;>;",
            "Lmd3;",
            "LLs4;",
            "I",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    const-string v0, "newList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diffSnapshot"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diffResult"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recordingCallback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lip;->f:LZD3;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lip;->e:LZD3;

    if-nez v1, :cond_1

    iput-object p1, p0, Lip;->e:LZD3;

    iget-object v1, p0, Lip;->i:Lkotlin/reflect/KFunction;

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p1, v1}, LZD3;->v(Lkotlin/jvm/functions/Function2;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lip;->f:LZD3;

    invoke-virtual {v0}, LZD3;->D()Lnd3;

    move-result-object v1

    invoke-virtual {p0}, Lip;->h()LBs2;

    move-result-object v2

    invoke-virtual {p2}, LZD3;->D()Lnd3;

    move-result-object v3

    invoke-static {v1, v2, v3, p3}, Lod3;->b(Lnd3;LBs2;Lnd3;Lmd3;)V

    iget-object v1, p0, Lip;->k:LZD3$b;

    invoke-virtual {p4, v1}, LLs4;->d(LZD3$b;)V

    iget-object p4, p0, Lip;->k:LZD3$b;

    invoke-virtual {p1, p4}, LZD3;->s(LZD3$b;)V

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_0

    invoke-virtual {v0}, LZD3;->D()Lnd3;

    move-result-object p4

    invoke-virtual {p2}, LZD3;->D()Lnd3;

    move-result-object p2

    invoke-static {p4, p3, p2, p5}, Lod3;->c(Lnd3;Lmd3;Lnd3;I)I

    move-result p2

    invoke-virtual {p1}, LZD3;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    const/4 p4, 0x0

    invoke-static {p2, p4, p3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result p2

    invoke-virtual {p1, p2}, LZD3;->L(I)V

    :cond_0
    iget-object p1, p0, Lip;->e:LZD3;

    invoke-virtual {p0, v0, p1, p6}, Lip;->j(LZD3;LZD3;Ljava/lang/Runnable;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "must be in snapshot state to apply diff"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j(LZD3;LZD3;Ljava/lang/Runnable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZD3<",
            "TT;>;",
            "LZD3<",
            "TT;>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lip;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lip$b;

    invoke-interface {v1, p1, p2}, Lip$b;->a(LZD3;LZD3;)V

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void
.end method

.method public final k(LBs2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lip;->a:LBs2;

    return-void
.end method

.method public l(LZD3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZD3<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lip;->m(LZD3;Ljava/lang/Runnable;)V

    return-void
.end method

.method public m(LZD3;Ljava/lang/Runnable;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZD3<",
            "TT;>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    iget v0, p0, Lip;->g:I

    add-int/lit8 v5, v0, 0x1

    iput v5, p0, Lip;->g:I

    iget-object v0, p0, Lip;->e:LZD3;

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void

    :cond_1
    const/4 v1, 0x0

    if-eqz v0, :cond_3

    instance-of v2, p1, Lq22;

    if-eqz v2, :cond_3

    iget-object p1, p0, Lip;->k:LZD3$b;

    invoke-virtual {v0, p1}, LZD3;->S(LZD3$b;)V

    iget-object p1, p0, Lip;->i:Lkotlin/reflect/KFunction;

    check-cast p1, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v0, p1}, LZD3;->T(Lkotlin/jvm/functions/Function2;)V

    iget-object p1, p0, Lip;->h:LZD3$e;

    sget-object v0, Lpt2;->b:Lpt2;

    sget-object v2, Lot2$b;->b:Lot2$b;

    invoke-virtual {p1, v0, v2}, LZD3$e;->e(Lpt2;Lot2;)V

    iget-object p1, p0, Lip;->h:LZD3$e;

    sget-object v0, Lpt2;->c:Lpt2;

    new-instance v2, Lot2$c;

    invoke-direct {v2, v1}, Lot2$c;-><init>(Z)V

    invoke-virtual {p1, v0, v2}, LZD3$e;->e(Lpt2;Lot2;)V

    iget-object p1, p0, Lip;->h:LZD3$e;

    sget-object v0, Lpt2;->d:Lpt2;

    new-instance v2, Lot2$c;

    invoke-direct {v2, v1}, Lot2$c;-><init>(Z)V

    invoke-virtual {p1, v0, v2}, LZD3$e;->e(Lpt2;Lot2;)V

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0}, Lip;->d()LZD3;

    move-result-object v2

    const/4 v3, 0x0

    if-nez p1, :cond_6

    invoke-virtual {p0}, Lip;->f()I

    move-result p1

    if-eqz v0, :cond_4

    iget-object v4, p0, Lip;->k:LZD3$b;

    invoke-virtual {v0, v4}, LZD3;->S(LZD3$b;)V

    iget-object v4, p0, Lip;->i:Lkotlin/reflect/KFunction;

    check-cast v4, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v0, v4}, LZD3;->T(Lkotlin/jvm/functions/Function2;)V

    iput-object v3, p0, Lip;->e:LZD3;

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lip;->f:LZD3;

    if-eqz v0, :cond_5

    iput-object v3, p0, Lip;->f:LZD3;

    :cond_5
    :goto_0
    invoke-virtual {p0}, Lip;->h()LBs2;

    move-result-object v0

    invoke-interface {v0, v1, p1}, LBs2;->onRemoved(II)V

    invoke-virtual {p0, v2, v3, p2}, Lip;->j(LZD3;LZD3;Ljava/lang/Runnable;)V

    return-void

    :cond_6
    invoke-virtual {p0}, Lip;->d()LZD3;

    move-result-object v0

    if-nez v0, :cond_7

    iput-object p1, p0, Lip;->e:LZD3;

    iget-object v0, p0, Lip;->i:Lkotlin/reflect/KFunction;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-virtual {p1, v0}, LZD3;->v(Lkotlin/jvm/functions/Function2;)V

    iget-object v0, p0, Lip;->k:LZD3$b;

    invoke-virtual {p1, v0}, LZD3;->s(LZD3$b;)V

    invoke-virtual {p0}, Lip;->h()LBs2;

    move-result-object v0

    invoke-virtual {p1}, LZD3;->size()I

    move-result v2

    invoke-interface {v0, v1, v2}, LBs2;->onInserted(II)V

    invoke-virtual {p0, v3, p1, p2}, Lip;->j(LZD3;LZD3;Ljava/lang/Runnable;)V

    return-void

    :cond_7
    iget-object v0, p0, Lip;->e:LZD3;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lip;->k:LZD3$b;

    invoke-virtual {v0, v1}, LZD3;->S(LZD3$b;)V

    iget-object v1, p0, Lip;->i:Lkotlin/reflect/KFunction;

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-virtual {v0, v1}, LZD3;->T(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0}, LZD3;->X()Ljava/util/List;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer.submitList$lambda-0>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LZD3;

    iput-object v0, p0, Lip;->f:LZD3;

    iput-object v3, p0, Lip;->e:LZD3;

    :cond_8
    iget-object v2, p0, Lip;->f:LZD3;

    if-eqz v2, :cond_9

    iget-object v0, p0, Lip;->e:LZD3;

    if-nez v0, :cond_9

    invoke-virtual {p1}, LZD3;->X()Ljava/util/List;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.paging.PagedList<T of androidx.paging.AsyncPagedListDiffer>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, LZD3;

    new-instance v7, LLs4;

    invoke-direct {v7}, LLs4;-><init>()V

    invoke-virtual {p1, v7}, LZD3;->s(LZD3$b;)V

    iget-object v0, p0, Lip;->b:Landroidx/recyclerview/widget/c;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/c;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v9, Lgp;

    move-object v1, v9

    move-object v4, p0

    move-object v6, p1

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Lgp;-><init>(LZD3;LZD3;Lip;ILZD3;LLs4;Ljava/lang/Runnable;)V

    invoke-interface {v0, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "must be in snapshot state to diff"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
