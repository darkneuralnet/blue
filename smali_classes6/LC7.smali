.class public final LLC7;
.super Lk58;
.source "SourceFile"

# interfaces
.implements Lrj8;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LuQ7;->K()LuQ7;

    move-result-object v0

    invoke-direct {p0, v0}, Lk58;-><init>(LV78;)V

    return-void
.end method

.method public synthetic constructor <init>(Lqf7;)V
    .locals 0

    invoke-static {}, LuQ7;->K()LuQ7;

    move-result-object p1

    invoke-direct {p0, p1}, Lk58;-><init>(LV78;)V

    return-void
.end method


# virtual methods
.method public final o(ILrj7;)LLC7;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LuQ7;

    invoke-static {v0, p1, p2}, LuQ7;->W(LuQ7;ILrj7;)V

    return-object p0
.end method
