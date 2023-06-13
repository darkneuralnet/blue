.class public LJb6$a;
.super LLw1$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJb6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:LuM4$e;


# direct methods
.method public constructor <init>(LuM4$e;)V
    .locals 0

    invoke-direct {p0}, LLw1$c;-><init>()V

    iput-object p1, p0, LJb6$a;->a:LuM4$e;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, LJb6$a;->a:LuM4$e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LuM4$e;->h(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, LJb6$a;->a:LuM4$e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LuM4$e;->i(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
