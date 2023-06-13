.class public final synthetic Lqu5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic b:Lpu5$c;

.field public final synthetic c:Lpu5;


# direct methods
.method public synthetic constructor <init>(Lpu5$c;Lpu5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqu5;->b:Lpu5$c;

    iput-object p2, p0, Lqu5;->c:Lpu5;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    iget-object v0, p0, Lqu5;->b:Lpu5$c;

    iget-object v1, p0, Lqu5;->c:Lpu5;

    invoke-static {v0, v1, p1, p2}, Lpu5$c;->a(Lpu5$c;Lpu5;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
