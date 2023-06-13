.class public final synthetic LFg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZg5$b;


# instance fields
.field public final synthetic a:LZg5;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LT96;


# direct methods
.method public synthetic constructor <init>(LZg5;Ljava/util/List;LT96;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFg5;->a:LZg5;

    iput-object p2, p0, LFg5;->b:Ljava/util/List;

    iput-object p3, p0, LFg5;->c:LT96;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LFg5;->a:LZg5;

    iget-object v1, p0, LFg5;->b:Ljava/util/List;

    iget-object v2, p0, LFg5;->c:LT96;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, LZg5;->x(LZg5;Ljava/util/List;LT96;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
