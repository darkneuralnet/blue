.class public final synthetic LmA6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/appcompat/app/ActionBar;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/ActionBar;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LmA6;->b:Landroidx/appcompat/app/ActionBar;

    iput-object p2, p0, LmA6;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LmA6;->b:Landroidx/appcompat/app/ActionBar;

    iget-object v1, p0, LmA6;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LnA6;->Pl(Landroidx/appcompat/app/ActionBar;Ljava/lang/String;)V

    return-void
.end method
