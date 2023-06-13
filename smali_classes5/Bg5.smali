.class public final synthetic LBg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZg5$b;


# instance fields
.field public final synthetic a:LZg5;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:LJk0$a;


# direct methods
.method public synthetic constructor <init>(LZg5;Ljava/lang/String;Ljava/util/Map;LJk0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBg5;->a:LZg5;

    iput-object p2, p0, LBg5;->b:Ljava/lang/String;

    iput-object p3, p0, LBg5;->c:Ljava/util/Map;

    iput-object p4, p0, LBg5;->d:LJk0$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LBg5;->a:LZg5;

    iget-object v1, p0, LBg5;->b:Ljava/lang/String;

    iget-object v2, p0, LBg5;->c:Ljava/util/Map;

    iget-object v3, p0, LBg5;->d:LJk0$a;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, v3, p1}, LZg5;->v(LZg5;Ljava/lang/String;Ljava/util/Map;LJk0$a;Landroid/database/sqlite/SQLiteDatabase;)LJk0;

    move-result-object p1

    return-object p1
.end method
