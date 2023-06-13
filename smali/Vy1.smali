.class public final synthetic LVy1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# instance fields
.field public final synthetic a:LnV5$a;

.field public final synthetic b:LUy1$b;


# direct methods
.method public synthetic constructor <init>(LnV5$a;LUy1$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVy1;->a:LnV5$a;

    iput-object p2, p0, LVy1;->b:LUy1$b;

    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    iget-object v0, p0, LVy1;->a:LnV5$a;

    iget-object v1, p0, LVy1;->b:LUy1$b;

    invoke-static {v0, v1, p1}, LUy1$c;->a(LnV5$a;LUy1$b;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method
