.class public final synthetic Lxr1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/b$b;


# instance fields
.field public final synthetic a:LIr1;

.field public final synthetic b:Lzr1;


# direct methods
.method public synthetic constructor <init>(LIr1;Lzr1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxr1;->a:LIr1;

    iput-object p2, p0, Lxr1;->b:Lzr1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/material/tabs/TabLayout$g;I)V
    .locals 2

    iget-object v0, p0, Lxr1;->a:LIr1;

    iget-object v1, p0, Lxr1;->b:Lzr1;

    invoke-static {v0, v1, p1, p2}, Lzr1;->N6(LIr1;Lzr1;Lcom/google/android/material/tabs/TabLayout$g;I)V

    return-void
.end method
