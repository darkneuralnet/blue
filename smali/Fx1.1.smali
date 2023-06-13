.class public final synthetic LFx1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe3;


# instance fields
.field public final synthetic b:LGx1;


# direct methods
.method public synthetic constructor <init>(LGx1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFx1;->b:LGx1;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LFx1;->b:LGx1;

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
