.class public final synthetic LKg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZg5$b;


# instance fields
.field public final synthetic a:LZg5;

.field public final synthetic b:LJg1;

.field public final synthetic c:LT96;


# direct methods
.method public synthetic constructor <init>(LZg5;LJg1;LT96;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKg5;->a:LZg5;

    iput-object p2, p0, LKg5;->b:LJg1;

    iput-object p3, p0, LKg5;->c:LT96;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LKg5;->a:LZg5;

    iget-object v1, p0, LKg5;->b:LJg1;

    iget-object v2, p0, LKg5;->c:LT96;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, LZg5;->B(LZg5;LJg1;LT96;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
