.class public abstract LdA3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LdA3$a;
    }
.end annotation


# instance fields
.field public final a:LdA3$a;


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, LdA3;->a:LdA3$a;

    invoke-virtual {v0}, LdA3$a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, LdA3;->a:LdA3$a;

    invoke-virtual {v0}, LdA3$a;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, LdA3;->a:LdA3$a;

    invoke-virtual {v0}, LdA3$a;->c()Landroid/location/Location;

    move-result-object v0

    return-object v0
.end method
