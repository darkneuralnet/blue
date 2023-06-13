.class public final synthetic LvM4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LuM4$e;

.field public final synthetic c:Landroid/graphics/Typeface;


# direct methods
.method public synthetic constructor <init>(LuM4$e;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvM4;->b:LuM4$e;

    iput-object p2, p0, LvM4;->c:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LvM4;->b:LuM4$e;

    iget-object v1, p0, LvM4;->c:Landroid/graphics/Typeface;

    invoke-static {v0, v1}, LuM4$e;->b(LuM4$e;Landroid/graphics/Typeface;)V

    return-void
.end method
