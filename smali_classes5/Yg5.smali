.class public final synthetic LYg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZg5$b;


# instance fields
.field public final synthetic a:LZg5;

.field public final synthetic b:LT96;


# direct methods
.method public synthetic constructor <init>(LZg5;LT96;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYg5;->a:LZg5;

    iput-object p2, p0, LYg5;->b:LT96;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LYg5;->a:LZg5;

    iget-object v1, p0, LYg5;->b:LT96;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, LZg5;->k(LZg5;LT96;Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
