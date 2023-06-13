.class public final synthetic LRg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZg5$d;


# instance fields
.field public final synthetic a:LRm5;


# direct methods
.method public synthetic constructor <init>(LRm5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRg5;->a:LRm5;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LRg5;->a:LRm5;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method
