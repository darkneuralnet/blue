.class public final Lzi7;
.super Lk58;
.source "SourceFile"

# interfaces
.implements Lrj8;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lrj7;->K()Lrj7;

    move-result-object v0

    invoke-direct {p0, v0}, Lk58;-><init>(LV78;)V

    return-void
.end method

.method public synthetic constructor <init>(Lqf7;)V
    .locals 0

    invoke-static {}, Lrj7;->K()Lrj7;

    move-result-object p1

    invoke-direct {p0, p1}, Lk58;-><init>(LV78;)V

    return-void
.end method


# virtual methods
.method public final o(I)Lzi7;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, Lrj7;

    invoke-static {v0, p1}, Lrj7;->L(Lrj7;I)V

    return-object p0
.end method

.method public final p(I)Lzi7;
    .locals 1

    invoke-virtual {p0}, Lk58;->m()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, Lrj7;

    invoke-static {v0, p1}, Lrj7;->M(Lrj7;I)V

    return-object p0
.end method
