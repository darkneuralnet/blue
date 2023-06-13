.class public final synthetic LSB5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic b:LQB5;

.field public final synthetic c:LQB5$b;


# direct methods
.method public synthetic constructor <init>(LQB5;LQB5$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSB5;->b:LQB5;

    iput-object p2, p0, LSB5;->c:LQB5$b;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    iget-object v0, p0, LSB5;->b:LQB5;

    iget-object v1, p0, LSB5;->c:LQB5$b;

    invoke-static {v0, v1, p1, p2}, LQB5$b;->a(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
