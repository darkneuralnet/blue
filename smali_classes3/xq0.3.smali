.class public final synthetic Lxq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lyq0;


# direct methods
.method public synthetic constructor <init>(Lyq0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq0;->a:Lyq0;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    iget-object v0, p0, Lxq0;->a:Lyq0;

    invoke-static {v0, p1, p2}, Lyq0$a;->a(Lyq0;Landroid/widget/RadioGroup;I)V

    return-void
.end method
