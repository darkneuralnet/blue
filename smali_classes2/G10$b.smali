.class public LG10$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCx0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG10;->J9()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LG10;


# direct methods
.method public constructor <init>(LG10;)V
    .locals 0

    iput-object p1, p0, LG10$b;->b:LG10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Lex0;)V
    .locals 1

    iget-object v0, p0, LG10$b;->b:LG10;

    invoke-virtual {v0, p1}, LG10;->Ga(Lex0;)V

    iget-object p1, p0, LG10$b;->b:LG10;

    invoke-virtual {p1}, LG10;->Ba()V

    iget-object p1, p0, LG10$b;->b:LG10;

    invoke-virtual {p1}, LG10;->S9()V

    return-void
.end method
